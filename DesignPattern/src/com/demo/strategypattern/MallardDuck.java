package com.demo.strategypattern;

import com.demo.strategypattern.behavior.FlyWithWings;
import com.demo.strategypattern.behavior.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck(){
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("我是一只绿头鸭子!");
		
	}

}
