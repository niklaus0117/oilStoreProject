package com.store.clientsoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.annguo.clientsoft.*.dao")
@SpringBootApplication
public class AnnguoApplication {
	public static void main(String[] args) {
		SpringApplication.run(AnnguoApplication.class, args);

	}

}
