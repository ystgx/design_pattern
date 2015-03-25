package com.demo.strategypattern;

import com.demo.strategypattern.behavior.FlyBehavior;
import com.demo.strategypattern.behavior.FlyNoWay;
import com.demo.strategypattern.behavior.Quack;
import com.demo.strategypattern.behavior.QuackBehavior;

public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	

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
	
	public void setFlyBehavior(FlyBehavior fly){
		this.flyBehavior = fly;
	}
	
	public void setQuackBehavior(QuackBehavior quack){
		this.quackBehavior = quack;
	}
}
