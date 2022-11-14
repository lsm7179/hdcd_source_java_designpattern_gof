package com.my.pattern.decorator;

public class VanillaLatte extends CoffeeDecorator {

    public VanillaLatte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String recipe() {
        return super.recipe() + " + 바닐라시럽";
    }
}
