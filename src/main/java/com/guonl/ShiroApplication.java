package com.guonl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan(basePackages = { "com.guonl" })
@SpringBootApplication
//@ImportResource({ "classpath:spring/*.xml" })
@MapperScan("com.guonl.dao")//将项目中对应的mapper类的路径加进来就可以了
public class ShiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShiroApplication.class, args);
	}

}

