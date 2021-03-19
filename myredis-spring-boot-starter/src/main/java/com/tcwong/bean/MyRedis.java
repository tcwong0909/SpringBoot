package com.tcwong.bean;

import com.alibaba.fastjson.JSONObject;

import java.text.MessageFormat;

/**
 * Description Redis操作类
 *
 * @author tcwong
 * @date 2021/3/19
 * Since 1.8
 */
public class MyRedis<V> {

    private String url;
    private String port;
    private String password;

    public MyRedis(String url, String port, String password) {
        // 配置参数校验
        if (url == null){
            throw new RuntimeException("myRedis连接url不能为空");
        }
        if (port == null){
            throw new RuntimeException("myRedis连接port不能为空");
        }
        if (password == null){
            throw new RuntimeException("myRedis连接password不能为空");
        }
        this.url = url;
        this.port = port;
        this.password = password;
        System.out.println(MessageFormat.format("myRedis已建立连接,地址:{0} 端口:{1} 密码:{2}",url,port,password));
    }

    /**
     * Description 模拟redis存储
     *
     * @param key 键
     * @param value 值
     * @return 值 JSON
     * @author tcwong
     * @date 2021/3/19
     */
    public String setValue(String key,V value){
        String valueString = JSONObject.toJSONString(value);
        System.out.println(MessageFormat.format("保存成功,key:{0} value:{1}",key,valueString));
        return valueString;
    }
}
