package com.carol.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @Author: Carol Tang
 * @Version: 1.0.0
 * @Date: 2018-09-07 16:16
 * @Description: 表单类
 **/
public class PersonForm {


    //@Size(min=2, max=30) name的长度为2-30个字符
    //@NotNull 不为空
   // @Min(18)age不能小于18


    @NotNull
    @Size(min = 2,max = 30)
    private String name;

    @NotNull
    @Min(18)
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
