package com.faraonelife.PizzaStore;

import com.faraonelife.PizzaStore.Pizzas.IPizza;

public class PizzaStore {
    private IPizzaFactory pf;
    public PizzaStore(IPizzaFactory pf){
        this.pf=pf;
    }
    public IPizza createPizza(String style){
        IPizza p=null;
        switch (style){
            case "cheese": p=this.pf.createCheesePizza();break;
            case "veggie": p=this.pf.createVeggiePizza();break;
            case "clam": p=this.pf.createClamPizza();break;
            case "pepperoni": p=this.pf.createPepperoniPizza();break;

        }
        p.prepare();
        p.bake();
        p.cut();
        p.box();
return p;
    }
}
