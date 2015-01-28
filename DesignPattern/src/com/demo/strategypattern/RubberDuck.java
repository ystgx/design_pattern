package com.demo.strategypattern;

import com.demo.strategypattern.behavior.FlyNoWay;
import com.demo.strategypattern.behavior.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Squeak();
			
	}

	@Override
	public void display() {
		System.out.println("我是一只橡皮鸭子!不会飞。");
	}

}
