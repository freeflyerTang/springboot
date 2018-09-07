package com.carol.entity;

/**
 * @Author: Carol Tang
 * @Version: 1.0.0
 * @Date: 2018-09-07 13:45
 * @Description: 实体类
 **/
public class Account {
    private int id;
    private String name;
    private Double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
