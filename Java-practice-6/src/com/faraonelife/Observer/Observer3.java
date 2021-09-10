package com.faraonelife.Observer;

public class Observer3 implements Observer {
    private double pres;
    @Override
    public void update(double temperature,double humidity,double pressure ) {
     this.pres=pressure;
    }
}
