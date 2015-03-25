package com.demo.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	@Override
	public void registerObserver(Observer o) {
		if(null == o)
			return;
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void norifyObservers() {
		for(Observer o : observers){
			o.update();
		}
		
	}

}
