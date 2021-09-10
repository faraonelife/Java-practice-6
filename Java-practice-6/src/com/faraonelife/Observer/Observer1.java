package com.faraonelife.Observer;

public class Observer1 implements Observer{
    private double temp;
    @Override
    public void update(double temperature,double humidity,double pressure ) {
        this.temp=temperature;
    }
}
