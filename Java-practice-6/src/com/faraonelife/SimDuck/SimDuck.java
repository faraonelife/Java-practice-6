package com.faraonelife.SimDuck;

import java.util.ArrayList;

public class SimDuck {
    public static void simulations(ArrayList<IDuck> ducks){
        System.out.println("Lets duck,lets quack");
        for(IDuck d:ducks){
            d.quack();
        }
        System.out.println("Lets duck,lets fly");
        for(IDuck d:ducks){
            d.fly();
        }
    }
}
