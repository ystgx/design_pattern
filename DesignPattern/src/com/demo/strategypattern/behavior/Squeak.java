package com.demo.strategypattern.behavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("橡皮鸭子的嘶喊！");
		
	}

}
