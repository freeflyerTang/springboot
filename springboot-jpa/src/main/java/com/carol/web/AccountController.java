package com.carol.web;

import com.carol.dao.AccountDao;
import com.carol.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Carol Tang
 * @Version: 1.0.0
 * @Date: 2018-09-06 16:01
 * @Description: 这里省略了service层，实际开发加上
 **/
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountDao accountDao;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Account> findAccountList() {
        return accountDao.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Account findAccountById(@PathVariable("id") int id) {
        return accountDao.findById(id).get();
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(@RequestParam(value = "name") String name,
                      @RequestParam(value = "money") double money){
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        Account accountn = accountDao.save(account);
        return accountn.toString();
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.PUT)
    public String update(@PathVariable("id") int id,@RequestParam(value = "name",required = true) String name,
                         @RequestParam(value = "money",required = true) Double money){
        Account account = new Account();
        account.setId(id);
        account.setName(name);
        account.setMoney(money);
        Account accountn = accountDao.saveAndFlush(account);
        return accountn.toString();
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id){
        accountDao.deleteById(id);
    }


}
