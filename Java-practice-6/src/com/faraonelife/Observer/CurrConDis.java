package com.faraonelife.Observer;

public class CurrConDis  implements Observer{
    private double temperature;
    private double humidity;
    private double pressure;
    private Subject weatherData;

    public CurrConDis(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.attach(this);
    }

    public void update(double temperature, double humidity,double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure=pressure;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity"+pressure+"% pressure");

    }

}
