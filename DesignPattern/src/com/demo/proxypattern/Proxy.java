package com.demo.proxypattern;

public class Proxy implements Subject {
	private Subject target;
	
	public Proxy(Subject target){
		this.target = target;
	}
	
	@Override
	public void doSomething(String thing) {
		doBefore();
		target.doSomething(thing);
		doAfter();
		
	}

	@Override
	public void doSometingMore() {
		doBefore();
		target.doSometingMore();
		doAfter();
	}
	private void doBefore(){
		System.out.println("In proxy do before");
	}
	
	private void doAfter(){
		System.out.println("In proxy do after");
	}
	
	public static void main(String [] args){
		Subject subject = new Proxy(new RealSubject());
		subject.doSomething("hello");
		subject.doSometingMore();
	}


}
