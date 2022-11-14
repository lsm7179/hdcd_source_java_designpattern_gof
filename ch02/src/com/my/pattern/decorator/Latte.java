package com.my.pattern.decorator;

public class Latte  extends CoffeDecorator {
    public Latte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String print() {
        return super.print() + " + 우유";
    }
}
