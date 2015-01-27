package com.demo.strategypattern;

import com.demo.strategypattern.behavior.MuteQuack;


public class Main {
	public static void main(String [] args) throws InterruptedException{
		Duck mallardDuck = new MallardDuck();
		Duck redheadDuck = new RedheadDuck();
		Duck rubberDuck = new RubberDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		System.out.println();
		Thread.sleep(2000);
		
		redheadDuck.display();
		redheadDuck.performFly();
		redheadDuck.performQuack();
		System.out.println();
		Thread.sleep(2000);
		
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.performQuack();
		System.out.println();
		Thread.sleep(2000);
		
		rubberDuck.setQuackBehavior(new MuteQuack());
		rubberDuck.display();
		rubberDuck.performFly();
		rubberDuck.performQuack();
	}
}
