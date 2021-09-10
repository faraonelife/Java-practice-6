package com.faraonelife.BuilderPattern;

public class Direactor {
    public Direactor(){

    }
   private String Sugar="out Sugar";
    private String SandM="Sugar and Milk";
    private String Milk="out Milk";
    private String tea="out Milk and Sugar";
    public void constructorWithout(){
        Builder builder=new Builder();
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        builder.getResult(tea);
    }
    public void constructorWithoutS(){
       Builder builder=new Builder();
       builder.buildPartA();
       builder.buildPartB();
       builder.buildPartC();
       builder.buildPartE();
       builder.getResult(Sugar);
    }
    public void constructorWith(){
        Builder builder=new Builder();
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        builder.buildPartD();
        builder.buildPartE();
        builder.getResult(SandM);
    }
    public void constructorWithoutM(){
        Builder builder=new Builder();
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        builder.buildPartD();
        builder.getResult(Milk);
    }

}
