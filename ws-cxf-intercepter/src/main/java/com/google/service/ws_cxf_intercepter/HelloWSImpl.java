package com.google.service.ws_cxf_intercepter;

import javax.jws.WebService;

@WebService
public class HelloWSImpl implements HelloWS {
	@Override
	public String sayHello(String name) {
		System.out.println("server sayHello()"+name);
		return "hello "+name;
	}
}
