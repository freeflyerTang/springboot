package com.carol.service;

import com.carol.entity.Account;
import com.carol.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Carol Tang
 * @Version: 1.0.0
 * @Date: 2018-09-07 13:54
 * @Description: service
 **/
@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;

    public int add(String name, double money) {
        return accountMapper.add(name, money);
    }
    public int update(String name, double money, int id) {
        return accountMapper.update(name, money, id);
    }
    public int delete(int id) {
        return accountMapper.delete(id);
    }
    public Account fineAccountById(int id) {
        return accountMapper.fineAccountById(id);
    }
    public List<Account> findAccountList() {
        return accountMapper.findAccountList();
    }
}
