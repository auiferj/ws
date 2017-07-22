package com.google.demo.rmi_client;

import java.rmi.Naming;

import com.google.demo.rmi.MyRemote;
/**
 * 客户端
 * @author zhangwei
 *
 */
public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}

	public void go() {
		try {
			String url = "rmi://127.0.0.1:1099/Remote_Hello";
			MyRemote service = (MyRemote) Naming.lookup(url);// 查询服务，返回stub，RMI自动将stub解序列化
			String a = service.sayHello();//调用方法
			System.out.println("调用结果：" + a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
