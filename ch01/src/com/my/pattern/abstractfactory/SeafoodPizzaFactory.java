package com.my.pattern.abstractfactory;

public class SeafoodPizzaFactory implements PizzaFactory{
    @Override
    public Pizza create() {
        return new SeafoodPizza();
    }
}
