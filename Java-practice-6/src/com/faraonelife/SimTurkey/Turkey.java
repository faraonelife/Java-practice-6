package com.faraonelife.SimTurkey;

public class Turkey implements ITurkey {
    private String name;
    public Turkey(String name){
        this.name=name;
    }

    @Override
    public void gobble(){
        System.out.println(this.name+"Turkey gobbles:gobble gobble");
    }
    @Override
    public void fly(){
        System.out.println(this.name+"Turkey flies away");
    }
}
