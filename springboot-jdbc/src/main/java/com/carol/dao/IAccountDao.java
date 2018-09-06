package com.carol.dao;

import com.carol.entity.Account;

import java.util.List;

public interface IAccountDao {
    int add(Account account);
    int update(Account account);
    int delete(int id);
    Account findAccountById(int id);
    List<Account> findAccountList();


}
