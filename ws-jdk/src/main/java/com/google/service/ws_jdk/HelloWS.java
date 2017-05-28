package com.google.service.ws_jdk;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWS {
	@WebMethod
	public String sayHello(String name);
}
