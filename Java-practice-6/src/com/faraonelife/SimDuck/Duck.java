package com.faraonelife.SimDuck;

public class Duck implements IDuck{
    private String name;
    public Duck(String name){
        this.name=name;
    }

    @Override
    public void quack(){
        System.out.println(this.name+"Duck quack:quack quack");
    }
    @Override
    public void fly(){
        System.out.println(this.name+"Duck flies away");
    }
}
