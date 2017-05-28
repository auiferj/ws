package com.google.service.ws_jdk.clienttest;

import com.google.service.ws_jdk.HelloWSImpl;
import com.google.service.ws_jdk.HelloWSImplService;

public class ClientTest {

	public static void main(String[] args) {
		HelloWSImplService factory = new HelloWSImplService();
		//factory.getHelloWSImplPort()得到HelloWSImpl的一个实现类；helloWSImpl是一个代理对象
		HelloWSImpl helloWSImpl = factory.getHelloWSImplPort();
		String result = helloWSImpl.sayHello("Tom2");
		System.out.println("client2 "+result);
	}

}
