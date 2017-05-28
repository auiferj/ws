package com.demo.client;

import org.apache.axis2.AxisFault;

import com.demo.client.HelloServiceStub.SayHello;
import com.demo.client.HelloServiceStub.SayHelloResponse;

public class ClientTest {
	public static void main(String[] args) {
		try {
			HelloServiceStub serviceStub = new HelloServiceStub();
			//SayHello是一个内部类
			SayHello sayHello = new HelloServiceStub.SayHello();
			sayHello.setName("Tom");
			//sayHello()方法的参数name是通过内部类传进去的
			SayHelloResponse response = serviceStub.sayHello(sayHello);
			System.out.println(response.get_return());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
