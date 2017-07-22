package com.google.demo.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 创建远程接口，继承Remote
 * Remote是标记性接口，和Serializable类似
 * 声明所有方法都抛出RemoteException，客户端必须处理或声明异常来认知这一风险
 * 远程方法的参数和返回值必须是Serializable或primate的，因为参数和返回值都是通过网络来传输的，必须可序列化
 * @author zhangwei
 *
 */
public interface MyRemote extends Remote {
	public String sayHello() throws RemoteException;
}
