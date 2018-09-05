package com.carol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Carol Tang
 * @Version: 1.0.0
 * @Date: 2018-09-04 17:36
 * @Description: 通过properties获取value
 **/
@RestController
@EnableConfigurationProperties({Girl.class,User.class})
public class UserController {
    @Autowired
    Girl girl ;

    @RequestMapping(value = "/girl")
    public String girl(){
        return girl.getGreeting()+" >>>>"+girl.getName()+" >>>>"+girl.getUuid()+" >>>>"+girl.getMax();
    }

    @Autowired
    User user;

    @RequestMapping(value = "/user")
    public String user(){
        return user.getName()+user.getAge();
    }
}
