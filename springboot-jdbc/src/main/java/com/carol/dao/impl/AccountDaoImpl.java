package com.carol.dao.impl;

import com.carol.dao.IAccountDao;
import com.carol.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Carol Tang
 * @Version: 1.0.0
 * @Date: 2018-09-06 13:02
 * @Description: 实现类
 **/
@Repository
public class AccountDaoImpl implements IAccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Account account) {
        return jdbcTemplate.update("INSERT INTO account(name,money) VALUES (?,?)",
                account.getName(),account.getMoney());
    }

    @Override
    public int update(Account account) {
        return jdbcTemplate.update("UPDATE account SET name=?,money=? WHERE id=?",
                account.getName(),account.getMoney(),account.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE FROM account WHERE id=?", id);
    }

    @Override
    public Account findAccountById(int id) {
        List<Account> list = jdbcTemplate.query("SELECT * FROM account WHERE id=?",
                new Object[]{id},new BeanPropertyRowMapper(Account.class));
        if (list!=null&&list.size()>0){
            Account account=list.get(0);
            return account;
        }else{
            return null;
        }

    }

    @Override
    public List<Account> findAccountList() {
        List<Account> list = jdbcTemplate.query("SELECT * FROM account",new Object[]{},new BeanPropertyRowMapper(Account.class));
        if (list!=null&&list.size()>0){
            return list;
        }else{
            return null;
        }

    }
}
