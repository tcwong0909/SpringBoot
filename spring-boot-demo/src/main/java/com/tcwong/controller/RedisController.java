package com.tcwong.controller;

import com.tcwong.bean.MyRedis;
import com.tcwong.entity.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Description redis Restful接口
 *
 * @author tcwong
 * @date 2021/3/19
 * Since 1.8
 */
@RestController
public class RedisController {

    @Resource private MyRedis myRedis;

    @PostMapping("/redis")
    public String redis(@RequestBody Student student){
        return myRedis.setValue(student.getId(),student);
    }

    public static void main(String[] args){
        System.out.println(UUID.randomUUID().toString().replace("-",""));
    }
}
