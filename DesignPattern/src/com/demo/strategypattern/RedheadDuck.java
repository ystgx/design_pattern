package com.demo.strategypattern;

import com.demo.strategypattern.behavior.FlyWithWings;
import com.demo.strategypattern.behavior.Quack;

public class RedheadDuck extends Duck{
	
	public RedheadDuck(){
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}
		
	
	@Override
	public void display() {
		System.out.println("我是一只红头鸭子~~~~");
		
	}

}
