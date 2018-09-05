package com.carol.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: Carol Tang
 * @Version: 1.0.0
 * @Date: 2018-09-05 10:50
 * @Description: 属性类
 **/
@Component
public class PropertiesConfigUser {

    @Value("${test.user.username}")
    private String username;

    @Value("${test.user.age}")
    private String age;

    @Value("${test.user.toString}")
    private String toString;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getToString() {
        return toString;
    }

    public void setToString(String toString) {
        this.toString = toString;
    }
}
