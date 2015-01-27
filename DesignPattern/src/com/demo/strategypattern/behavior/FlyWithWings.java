package com.demo.strategypattern.behavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I have wings to fly!");
	}

}
