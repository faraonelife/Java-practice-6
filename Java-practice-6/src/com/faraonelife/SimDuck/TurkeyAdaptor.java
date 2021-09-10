package com.faraonelife.SimDuck;

import com.faraonelife.SimTurkey.ITurkey;

public class TurkeyAdaptor implements IDuck,ITurkey {
    private ITurkey turkey;
    private IDuck duck;
public TurkeyAdaptor(ITurkey turkey){
    this.turkey=turkey;
}
public TurkeyAdaptor(IDuck duck){this.duck=duck;}
    @Override
    public void quack() {
        this.turkey.gobble();

    }

    @Override
    public void gobble() {
    this.duck.quack();

    }

    @Override
    public void fly() {
    if(this.turkey!=null) {
    this.turkey.fly();
    }
    else {
        this.duck.fly();
    }
    }

    }

