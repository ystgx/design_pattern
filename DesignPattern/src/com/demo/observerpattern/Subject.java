package com.demo.observerpattern;

public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void norifyObservers();
}
