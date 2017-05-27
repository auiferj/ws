package com.demo.service;

import org.springframework.stereotype.Component;

@Component(value="helloServiceImpl")
public class HelloServiceImpl implements HelloService {
	@Override
	public String sayHello(String name) {
		return "Hello "+name;
	}
}
