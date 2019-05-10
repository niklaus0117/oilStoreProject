package com.store.clientsoft.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoApplication {
	
	@RequestMapping("/")
	public String index(){
		return "Hello Spring Boot";
	}
}
