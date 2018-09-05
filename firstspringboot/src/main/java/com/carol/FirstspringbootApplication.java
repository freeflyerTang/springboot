package com.carol;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication //Spring Boot的核心注解,它是一个复合注解，用于开启组件扫描和自动配置
public class FirstspringbootApplication {

	public static void main(String[] args) {
		//在main()方法中通过调用SpringApplication类的run()方法将业务委托给了Spring Boot的SpringApplication类
		//SpringApplication类引导应用程序启动Spring，并相应地启动自动配置的Tomcat服务器
		//只需要将FirstspringbootApplication.class作为参数传递给run()方法，以此来通知SpringApplication谁是主要的Spring组件，并传递args数组作为参数即可
		SpringApplication.run(FirstspringbootApplication.class, args);
	}

	//在程序入口加入下面代码，看看springboot在启动时为我们注入了哪些bean
//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
//		return args -> {
//			System.out.println("Let's inspect the beans provided by Spring Boot:");
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName:beanNames ) {
//				System.out.println(beanName);
//			}
//		};
//
//	}
}
