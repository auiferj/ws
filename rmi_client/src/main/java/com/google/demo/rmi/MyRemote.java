package com.google.demo.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Remote是标记性接口，和Serializable类似
 * 
 * @author zhangwei
 *
 */
public interface MyRemote extends Remote {
	public String sayHello() throws RemoteException;
}
