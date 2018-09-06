package com.carol.service.impl;

import com.carol.dao.IAccountDao;
import com.carol.entity.Account;
import com.carol.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Carol Tang
 * @Version: 1.0.0
 * @Date: 2018-09-06 13:15
 * @Description: 接口实现类
 **/
@Service
public class AccountServiceImpl  implements IAccountService {
    @Autowired
    IAccountDao iAccountDao;

    @Override
    public int add(Account account) {
        return iAccountDao.add(account);
    }

    @Override
    public int update(Account account) {
        return iAccountDao.update(account);
    }

    @Override
    public int delete(int id) {
        return iAccountDao.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return iAccountDao.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return iAccountDao.findAccountList();
    }
}
