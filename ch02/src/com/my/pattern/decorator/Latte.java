package com.my.pattern.decorator;

public class Latte  extends CoffeDecorator {
    public Latte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String recipe() {
        return super.recipe() + " + 우유";
    }
}
