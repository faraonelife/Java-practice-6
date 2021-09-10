package com.faraonelife.PizzaStore;

import com.faraonelife.PizzaStore.Pizzas.IPizza;

public interface IPizzaFactory {
    IPizza createCheesePizza();
    IPizza createVeggiePizza();
    IPizza createClamPizza();
    IPizza createPepperoniPizza();

}
