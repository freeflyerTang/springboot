package com.carol.entity;

/**
 * @Author: Carol Tang
 * @Version: 1.0.0
 * @Date: 2018-09-06 11:55
 * @Description: 实体类
 **/
public class Account {
    private int id;
    private String name;
    private double money;

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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
