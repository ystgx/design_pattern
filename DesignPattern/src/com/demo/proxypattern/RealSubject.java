package com.demo.proxypattern;

public class RealSubject implements Subject {

	@Override
	public void doSomething(String thing) {
		
		System.out.println("In realsubject do  " + thing);
	}

	@Override
	public void doSometingMore() {
		System.out.println("In realsubject do something more " );
		
	}

}
