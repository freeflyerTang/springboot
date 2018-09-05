package com.carol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Carol Tang
 * @Version: 1.0.0
 * @Date: 2018-09-05 10:54
 * @Description: 属性类的Controller
 **/
@RestController
public class ProcfgController {
    @Autowired
    PropertiesConfigUser propertiesConfigUser;

    @RequestMapping(value = "procfg",method = RequestMethod.GET)
    public String procfg(){
        return propertiesConfigUser.getToString();
    }
}
