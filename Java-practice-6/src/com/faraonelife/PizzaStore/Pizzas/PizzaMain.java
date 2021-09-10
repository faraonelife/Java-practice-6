package com.faraonelife.PizzaStore.Pizzas;

public class PizzaMain implements IPizza {
    protected  String name;
    @Override
    public void prepare() {
        System.out.println(this.name+"is prepared");
    }
    @Override
    public void bake() {
        System.out.println(this.name+"is baked");
    }
    @Override
    public void cut() {
        System.out.println(this.name+"is cut");
    }

    @Override
    public void box() {
        System.out.println(this.name+"is boxed");
    }
}
