package com.demo.decoratorpattern;

public abstract class  Beverage {
	protected String description = "unknown";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
