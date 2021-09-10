package com.faraonelife.PizzaStore;

import com.faraonelife.PizzaStore.Pizzas.Chicago.ChicagoPizzaFactory;
import com.faraonelife.PizzaStore.Pizzas.NY.NYPizzaFactory;

public class PizzaStoreTester {
    public static void start(){
        NYPizzaFactory nyPizzaFactory=new NYPizzaFactory();
        ChicagoPizzaFactory chicagoPizzaFactory=new ChicagoPizzaFactory();
    PizzaStore pizaatime1=new PizzaStore(nyPizzaFactory);
        PizzaStore pizzatime2=new PizzaStore(chicagoPizzaFactory);
    pizaatime1.createPizza("cheese");
    pizzatime2.createPizza("pepperoni");
    }
}
