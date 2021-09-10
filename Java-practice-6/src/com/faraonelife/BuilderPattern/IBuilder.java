package com.faraonelife.BuilderPattern;

public interface IBuilder {
    void buildPartA();
    void buildPartB();
    void buildPartC();
    void buildPartD();
    void buildPartE();
    void getResult(String type);
}
