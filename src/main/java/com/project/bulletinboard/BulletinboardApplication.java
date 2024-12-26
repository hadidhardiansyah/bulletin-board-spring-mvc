package com.project.bulletinboard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.project.bulletinboard.mapper")
public class BulletinboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BulletinboardApplication.class, args);
	}

}
