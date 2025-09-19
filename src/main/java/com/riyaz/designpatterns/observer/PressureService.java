package com.riyaz.designpatterns.observer;

public class PressureService implements Observer{
    public void trigger(double value) {
        NotificationUtils.sendNotification("New value is " + value);
    }

    @Override
    public void update(double newValue) {
        trigger(newValue);
    }
}