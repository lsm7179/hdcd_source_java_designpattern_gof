package com.my.pattern.decorator;

public class Americano extends CoffeDecorator {
    public Americano(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String print() {
        return super.print() + " + 물";
    }
}
