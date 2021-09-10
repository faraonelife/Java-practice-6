package com.faraonelife.Observer;

public class Observer2 implements Observer {
    private double hum;
    @Override
    public void update(double temperature,double humidity,double pressure ) {
        this.hum=humidity;
    }
}
