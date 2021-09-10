package com.faraonelife.BuilderPattern;

public class Builder implements IBuilder {


    @Override
    public void buildPartA() {
System.out.println("Start Tea preparation");
    }

    @Override
    public void buildPartB() {
        System.out.println("Boil water");

    }

    @Override
    public void buildPartC() {
        System.out.println("Put tea Bugs");

    }

    @Override
    public void buildPartD() {System.out.println("Put Sugar");

    }

    @Override
    public void buildPartE() {System.out.println("Put Milk");

    }



    @Override
    public void getResult(String type) {System.out.printf("Tea with%s",type);

    }
}
