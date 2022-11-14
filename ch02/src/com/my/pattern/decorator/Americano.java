package com.my.pattern.decorator;

public class Americano extends CoffeeDecorator {
    public Americano(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String recipe() {
        return super.recipe() + " + 물";
    }
}
