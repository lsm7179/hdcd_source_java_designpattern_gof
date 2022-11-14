package com.my.pattern.decorator;

public class VanillaLatte extends CoffeDecorator {

    public VanillaLatte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String print() {
        return super.print() + " + 바닐라시럽";
    }
}
