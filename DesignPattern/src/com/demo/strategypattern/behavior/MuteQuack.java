package com.demo.strategypattern.behavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("不能发出一点声音!");
		
	}

}
