package com.faraonelife.PizzaStore.Pizzas.Chicago;

import com.faraonelife.PizzaStore.IPizzaFactory;
import com.faraonelife.PizzaStore.Pizzas.IPizza;
import com.faraonelife.PizzaStore.Pizzas.NY.NYStyleClamPizza;


public class ChicagoPizzaFactory implements IPizzaFactory {
    @Override
    public IPizza createCheesePizza() {
        return new ChicagoStyleCheesePizza();
    }

    @Override
    public IPizza createVeggiePizza() {
        return new ChicagoStyleVeggiePizza();
    }

    @Override
    public IPizza createClamPizza() {
        return new ChicagoStyleClamPizza();
    }

    @Override
    public IPizza createPepperoniPizza() {
        return new ChicagoStylePepperoniPizza();
    }
}
