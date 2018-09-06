package com.carol.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Carol Tang
 * @Version: 1.0.0
 * @Date: 2018-09-06 15:54
 * @Description: 实体类
 **/
//@Entity 表明是一个映射的实体类， @Id表明id， @GeneratedValue 字段自动生成
@Entity
public class Account {

    @Id
    // 此种主键生成策略就是通常所说的主键自增长,数据库在插入数据时,会自动给主键赋值,
    // 比如MYSQL可以在创建表时声明"auto_increment" 来指定主键自增长
    // 解决Table 'sys.hibernate_sequence' doesn't exist 异常
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
