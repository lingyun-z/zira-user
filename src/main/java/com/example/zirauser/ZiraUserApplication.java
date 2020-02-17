package com.example.zirauser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.example.zirauser.dao")
public class ZiraUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZiraUserApplication.class, args);
	}

}
