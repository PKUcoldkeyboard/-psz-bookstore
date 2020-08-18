package com.cuterwrite.rbspring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cuterwrite.rbspring.dao")
@SpringBootApplication
public class RbSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RbSpringApplication.class, args);
	}

}
