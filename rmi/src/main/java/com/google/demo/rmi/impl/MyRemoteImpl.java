package com.google.demo.rmi.impl;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import com.google.demo.rmi.MyRemote;
/**
 * 实现远程接口
 * 继承UnicastRemoteObject
 * 编写声明RemoteException的无参构造方法
 * @author zhangwei
 *
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	protected MyRemoteImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello() throws RemoteException {
		return "Server says,'hello'";
	}

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);//启动服务
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("Remote_Hello", service);//注册服务，RMI系统将stub加到Registry
			 System.out.println("ServiceMain provide RPC service now.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
