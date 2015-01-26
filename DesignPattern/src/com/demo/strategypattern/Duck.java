package com.demo.strategypattern;

import com.demo.strategypattern.behavior.FlyBehavior;
import com.demo.strategypattern.behavior.FlyNoWay;
import com.demo.strategypattern.behavior.Quack;
import com.demo.strategypattern.behavior.QuackBehavior;

public abstract class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}
	public Duck(){
		this(new FlyNoWay(),new Quack());
	}
	abstract void display();
	public void swim(){
		System.out.println("I am swimming!");
	}
	public void performQuack(){
		quackBehavior.quack();
	}
	public void performFly(){
		flyBehavior.fly();
	}
}
