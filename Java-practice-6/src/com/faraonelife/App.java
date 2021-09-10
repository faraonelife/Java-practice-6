package com.faraonelife;


import com.faraonelife.BuilderPattern.Tea;
import com.faraonelife.Observer.WeatherStationTest;
import com.faraonelife.PizzaStore.PizzaStore;
import com.faraonelife.PizzaStore.PizzaStoreTester;
import com.faraonelife.SimDuck.SimDuckTest;

public class App {
    public static void main(String[] args){
        //program1
        SimDuckTest.start();

        //program2
        Tea.choice();
        System.out.println("\n");
        //program 3
     //  WeatherStationTest.start();
        //program 4
        PizzaStoreTester.start();
    }
}
