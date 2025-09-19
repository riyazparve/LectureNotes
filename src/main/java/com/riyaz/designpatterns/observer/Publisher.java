package com.riyaz.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher implements ObserverRegistry {

    private List<Observer> observers;

    public Publisher() {
	observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
	observers.add(observer);
    }

    @Override
    public void notifyObservers(double value) {
	for (Observer observer : observers) {
	    observer.update(value);
	}
    }

    @Override
    public void removeObserver(Observer observer) {
	observers.remove(observer);
    }

}