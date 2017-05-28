package com.google.service.ws_jdk.servertest;

import javax.xml.ws.Endpoint;

import com.google.service.ws_jdk.HelloWSImpl;

public class ServerTest {
	public static void main(String[] args) {
		String address="http://localhost:8989/ws_jdk/hellows";
		Endpoint.publish(address, new HelloWSImpl());
		System.out.println("发布WebService成功！");
	}
}
