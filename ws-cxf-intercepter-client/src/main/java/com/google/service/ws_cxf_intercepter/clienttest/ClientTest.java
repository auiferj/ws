package com.google.service.ws_cxf_intercepter.clienttest;

import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;

import com.google.service.ws_cxf_intercepter.HelloWS;
import com.google.service.ws_cxf_intercepter.HelloWSImplService;

public class ClientTest {
	public static void main(String[] args) {
		HelloWSImplService factory = new HelloWSImplService();
		// factory.getHelloWSImplPort()得到HelloWSImpl的一个实现类；helloWSImpl是一个代理对象
		HelloWS helloWSImplPort = factory.getHelloWSImplPort();
		Client client = ClientProxy.getClient(helloWSImplPort);

		// 服务端的日志入拦截器
		List<Interceptor<? extends Message>> inInterceptors = client.getInInterceptors();
		inInterceptors.add(new LoggingInInterceptor());
		// 服务端的日志出拦截器
		List<Interceptor<? extends Message>> outInterceptors = client.getOutInterceptors();
		outInterceptors.add(new LoggingOutInterceptor());
		
		String result = helloWSImplPort.sayHello("Tom");
		System.out.println("client " + result);
	}
}
