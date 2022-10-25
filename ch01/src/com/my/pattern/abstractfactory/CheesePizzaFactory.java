package com.my.pattern.abstractfactory;

public class CheesePizzaFactory implements PizzaFactory {

    public Pizza create(){
       return new CheesePizza();
    }
}
