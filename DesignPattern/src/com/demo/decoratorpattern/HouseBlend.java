package com.demo.decoratorpattern;

public class HouseBlend  extends Beverage{
	public HouseBlend(){
		description = "House Blend Coffe";
	}
	
	@Override
	public double cost() {
		return 1.2;
	}

}
