package com.my.pattern.abstractfactory;

public class BaconPizzaFactory implements PizzaFactory{

    @Override
    public Pizza create() {
        return new BaconPizza();
    }
}
