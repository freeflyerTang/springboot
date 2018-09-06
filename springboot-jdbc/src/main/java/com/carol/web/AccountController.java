package com.carol.web;

import com.carol.entity.Account;
import com.carol.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Carol Tang
 * @Version: 1.0.0
 * @Date: 2018-09-06 13:18
 * @Description: 控制层
 **/
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    IAccountService iAccountService;

    //请求：http://localhost:8080/account/list
    //返回: [{"id":1,"name":"aaa","money":1000.0},{"id":2,"name":"bbb","money":1000.0},{"id":3,"name":"ccc","money":1000.0}]
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Account> findAccountList(){
        return iAccountService.findAccountList();
    }

    //请求：http://localhost:8080/account/1
    //返回: {"id":1,"name":"aaa","money":1000.0}
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Account findAccountById(@PathVariable("id") int id){
        return iAccountService.findAccountById(id);
    }

    //使用SoapUI或者postman等测试工具测试
    //POST http://localhost:8080/account/addJSON
    //{"name":"lisi","money":666}
    @RequestMapping(value = "/addJSON",method = RequestMethod.POST)
    public String addJSON(@RequestBody Account account){ //@RequestBody只能出现一次
        int ret = iAccountService.add(account);
        if (ret == 1){
            return account.toString();
        }else{
            return "add fail";
        }
    }

    //使用SoapUI或者postman等测试工具测试
    //PUT http://localhost:8080/account/update/1?name=zhangsan&money=999
    @RequestMapping(value = "/update/{id}",method = RequestMethod.PUT)
    public String update(@PathVariable("id") int id, @RequestParam(value = "name",required = true) String name,
                      @RequestParam(value = "money",required = true) Double money){
        Account account = new Account();
        account.setId(id);
        account.setName(name);
        account.setMoney(money);
        int ret = iAccountService.update(account);
        if (ret == 1){
            return account.toString();
        }else{
            return "update fail";
        }
    }

    //使用SoapUI或者postman等测试工具测试
    //DELETE http://localhost:8080/account/delete/3
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") int id){
        int ret = iAccountService.delete(id);
        if (ret == 1){
            return "delete success";
        }else{
            return "delete fail";
        }
    }

//    //使用SoapUI或者postman等测试工具测试
//    //PUT http://localhost:8080/account/deletePUT/3
//    @RequestMapping(value = "/deletePUT/{id}",method = RequestMethod.PUT)
//    public String deletePUT(@PathVariable("id") int id){
//        int ret = iAccountService.delete(id);
//        if (ret == 1){
//            return "delete success";
//        }else{
//            return "delete fail";
//        }
//    }
//
//
//
//    //使用SoapUI或者postman等测试工具测试
//    //POST http://localhost:8080/account/add?name=zhangsan&money=999
//    @RequestMapping(value = "/add",method = RequestMethod.POST)
//    public String add(@RequestParam("name") String name,@RequestParam("money") Double money){
//        Account account = new Account();
//        account.setName(name);
//        account.setMoney(money);
//        int ret = iAccountService.add(account);
//        if (ret == 1){
//            return account.toString();
//        }else{
//            return "add fail";
//        }
//    }
}
