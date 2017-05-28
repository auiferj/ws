package com.demo.client;

import java.net.URL;
import java.rmi.RemoteException;

import localhost.ws_axis.services.HelloWSDD.HelloWSDDSoapBindingStub;

public class ClientTest {
	public static void main(String[] args) {
		String wsdlUrl = "http://localhost:8080/ws-axis/services/HelloWSDD?wsdl";
		org.apache.axis.client.Service service = new org.apache.axis.client.Service();
		try {
			// 生成的客户端代码中有XxxStub类，可如下方式使用
			HelloWSDDSoapBindingStub stub = new HelloWSDDSoapBindingStub(new URL(wsdlUrl), service);

			// 有些webservice需要登录，登陆后才能进行一些操作，这个需要设置如下两个参数：
			// 超时时间
			// stub.setTimeout(1000 * 60 * 20);
			// 次数设置true，登录后才能保持登录状态，否则第二次调用ws方法时仍然会提示未登录。
			// stub.setMaintainSession(true);
			// 调用ws的方法
			// stub.userLogin("admin", "admin");

			// 调用ws的方法
			String hello = stub.hello("TOM");
			Float sum = stub.add(1f, 2f);
			System.out.println(hello);
			System.out.println(sum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
