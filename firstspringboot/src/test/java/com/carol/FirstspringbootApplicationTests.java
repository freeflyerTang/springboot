package com.carol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) //注解表示测试运行在Spring测试环境中
@SpringBootTest //是Spring Boot提供的注解，该注解通过SpringApplication在测试中创建应用上下文来工作
public class FirstspringbootApplicationTests {

	@Test
	public void contextLoads() {
		//此方法可以确定应用程序上下文的加载是否有问题
		// 如果FirstspringbootApplication中定义的配置是正确的，那么就可以通过测试，否则，不能通过测试


	}


}
