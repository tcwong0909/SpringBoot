package com.tcwong.config;

import com.tcwong.bean.MyRedis;
import com.tcwong.properties.MyRedisProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

/**
 * Description bean 注册
 *
 * @author tcwong
 * @date 2021/3/19
 * Since 1.8
 */
@Configuration
@ConditionalOnClass(Jedis.class)
@EnableConfigurationProperties(MyRedisProperty.class)
public class MyRedisAutoConfiguration {

    @Resource private MyRedisProperty myRedisProperty;

    @Bean
    MyRedis myRedis(){
        MyRedis<Object> myRedis = new MyRedis<>(myRedisProperty.getUrl()
                , myRedisProperty.getPort()
                , myRedisProperty.getPassword());
        return myRedis;
    }
}
