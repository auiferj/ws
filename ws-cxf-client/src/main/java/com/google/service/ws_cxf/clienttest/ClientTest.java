package com.google.service.ws_cxf.clienttest;

import com.google.service.ws_cxf.HelloWS;
import com.google.service.ws_cxf.HelloWSImplService;

public class ClientTest {
	public static void main(String[] args) {
		HelloWSImplService factory = new HelloWSImplService();
		//factory.getHelloWSImplPort()得到HelloWSImpl的一个实现类；helloWSImpl是一个代理对象
		HelloWS helloWSImplPort = factory.getHelloWSImplPort();
		String result = helloWSImplPort.sayHello("Tom");
		System.out.println("client "+result);
	}
}
