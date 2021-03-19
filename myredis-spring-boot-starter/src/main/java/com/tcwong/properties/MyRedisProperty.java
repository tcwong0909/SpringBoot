package com.tcwong.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Description 参数接收
 *
 * @author tcwong
 * @date 2021/3/19
 * Since 1.8
 */
@ConfigurationProperties(prefix = "myredis")
public class MyRedisProperty {

    private String url;
    private String port;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
