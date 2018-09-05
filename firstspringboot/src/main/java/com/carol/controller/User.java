package com.carol.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: Carol Tang
 * @Version: 1.0.0
 * @Date: 2018-08-23 17:55
 * @Description: 将properties文件信息赋予javabean
 **/
@Configuration
@PropertySource(value="classpath:test.properties")//在1.4版本需要PropertySource加上location
@ConfigurationProperties(prefix="usa")
public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
