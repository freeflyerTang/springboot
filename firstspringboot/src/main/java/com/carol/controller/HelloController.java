package com.carol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Carol Tang
 * @Version: 1.0.0
 * @Date: 2018-08-23 11:50
 * @Description: 控制类
 **/
@RestController //等同于同时加上了@Controller和@ResponseBody
@EnableConfigurationProperties({Girl.class})
public class HelloController {

    //第一种方式：读取配置文件的值只需要加@Value(“${属性名}”)
    @Value("${girl.name}")
    private String name;

    @Value("${girl.age}")
    private int age;

    //第二种方式：将配置文件的属性赋给实体类
    @Autowired
    Girl girl;



    //##############################################################
    //  在无任何配置时，浏览器访问：http://localhost:8080/，
    //  输出Greetings from Spring Boot!
    //  因为Spring Boot内嵌Tomcat，默认端口为8080
    //##############################################################
    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }



    /**
     * @Description: 第一种方式：通过value获取属性值
     * @Param: []
     * @return: java.lang.String
     * @Author: Carol Tang
     * @Date: 2018/8/23
     **/
    //访问/hello或者/hi任何一个地址，都会返回一样的结果
    @RequestMapping(value={"/hello","/hi"},method = RequestMethod.GET)
    //等价于@GetMaping(value="/hello")
    //如果是POST请求，则等价于@PostMapping
    public String say(){
        return "hi you!!!"+name+":"+age;
    }

    /**
     * @Description: 第二种方式：通过实体类获取属性值
     * @Param: []
     * @return: java.lang.String
     * @Author: Carol Tang
     * @Date: 2018/8/23
     **/
    @RequestMapping(value = "/createBean")
    public String crtBean(){
        return girl.getGreeting()+" >>>>"+girl.getName()+" >>>>"+ girl.getUuid()+" >>>>"+girl.getMax();
    }
}
