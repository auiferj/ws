package com.google.service.ws_cxf_intercepter.servertest;

import java.util.List;

import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.message.Message;

import com.google.service.ws_cxf_intercepter.HelloWSImpl;

public class ServerTest {
	public static void main(String[] args) {
		String address="http://localhost:8989/ws_jdk/hellows";
		Endpoint endpoint = Endpoint.publish(address, new HelloWSImpl());
		EndpointImpl endpointImpl= (EndpointImpl)endpoint;
		//服务端的日志入拦截器
		List<Interceptor<? extends Message>> inInterceptors = endpointImpl.getInInterceptors();
		inInterceptors.add(new LoggingInInterceptor());
		//服务端的日志出拦截器
		List<Interceptor<? extends Message>> outInterceptors = endpointImpl.getOutInterceptors();
		outInterceptors.add(new LoggingOutInterceptor());
		System.out.println("发布WebService成功！");
	}
}
