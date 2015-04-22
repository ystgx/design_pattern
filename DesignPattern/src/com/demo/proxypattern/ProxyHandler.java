package com.demo.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
	private Object proxied;
	
	public ProxyHandler( Object proxied )   
	  {   
	    this.proxied = proxied;   
	  }   
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		doSomethingBefore(args);
		method.invoke(proxied, args);
		doSomethingAfter(args);
		return null;
	}
	
	private void doSomethingBefore(Object[] args){
		String things = "";
		if (args != null) {
			for (Object o : args) {
				things = things + (String) o;
			}
		}
		System.out.println("In proxy do before  "+ things);
	}

	private void doSomethingAfter(Object[] args){
		String things = "";
		if (args != null) {
			for (Object o : args) {
				things = things + (String) o;
			}
		}
		System.out.println("In proxy do after  "+ things);
	}
	
	public static void main(String [] args){
		RealSubject target = new RealSubject();
		Subject proxy = (Subject)java.lang.reflect.Proxy.newProxyInstance(Subject.class.getClassLoader(),
				new Class[]{Subject.class}, new ProxyHandler(target));
		proxy.doSomething("haha");
		proxy.doSometingMore();
	}
	
}
