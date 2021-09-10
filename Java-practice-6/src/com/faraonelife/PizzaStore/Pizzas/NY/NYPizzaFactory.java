package com.faraonelife.PizzaStore.Pizzas.NY;

import com.faraonelife.PizzaStore.IPizzaFactory;
import com.faraonelife.PizzaStore.Pizzas.IPizza;
import com.faraonelife.PizzaStore.Pizzas.NY.NYStyleCheesePizza;
import com.faraonelife.PizzaStore.Pizzas.NY.NYStyleVeggiePizza;

public class NYPizzaFactory implements IPizzaFactory {
    @Override
    public IPizza createCheesePizza() {
        return new NYStyleCheesePizza();
    }

    @Override
    public IPizza createVeggiePizza() {
        return new NYStyleVeggiePizza();
    }

    @Override
    public IPizza createClamPizza() {
        return new NYStyleClamPizza();
    }

    @Override
    public IPizza createPepperoniPizza() {
        return new NYStylePepperoniPizza();
    }
}
