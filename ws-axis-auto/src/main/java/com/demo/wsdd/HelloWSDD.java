package com.demo.wsdd;

public class HelloWSDD {
	private int requestCount=0;
	public String hello(String name) {
		requestCount++;
		System.out.println("调用的次数 "+requestCount);
		return "欢迎你 " + name;
	}

	public Float add(Float a, Float b) {
		requestCount++;
		System.out.println("调用的次数 "+requestCount);
		return a + b;
	}
}
