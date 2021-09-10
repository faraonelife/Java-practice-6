package com.faraonelife.Observer;

import java.util.ArrayList;
import java . util . TimerTask ;
import java . util . Random ;
public class WeatherStation extends TimerTask implements Subject{
    private Random rand = new Random ();
    // weather params
    private double temperature ;
    private double humidity ;
    private double pressure ;
// your code for storing list of observers

    ArrayList<Observer>observers;
    public WeatherStation(){
        observers=new ArrayList<>();
    }


    @Override
    public void run () {
        updateParameters ();
        notifyObservers ();
    }
    private void updateParameters () {
        this . temperature *= getUpdateCoef ();
        this . humidity *= getUpdateCoef ();
        this . pressure *= getUpdateCoef ();
    }
    // find a random coefficient between 0.95 and 1.05
    private double getUpdateCoef () {
        return this . rand . nextInt (10)/100.0 + 0.95;
    }


    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);

    }

    @Override
    public void detach(Observer observer) {int i=observers.indexOf(observer);
    if(i>=0){
        observers.remove(observer);
    }

    }

    public void notifyObservers () {
for(int i=0;i<observers.size();++i){
    Observer observer=(Observer)observers.get(i);
observer.update(temperature,humidity,pressure);

}

    }

    public void setTemperature(double temperature) {

        this.temperature = temperature;


    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;

    }

    public void setPressure(double pressure) {
        this.pressure = pressure;

    }



}
