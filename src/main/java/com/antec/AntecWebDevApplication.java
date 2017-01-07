package com.antec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.antec.model.mapper*")
public class AntecWebDevApplication {

	/* spring boot security refrence*/
	//http://wannabe-jellyfish.hatenablog.com/entry/2016/05/15/142600
	public static void main(String[] args) {
		SpringApplication.run(AntecWebDevApplication.class, args);
	}
}
