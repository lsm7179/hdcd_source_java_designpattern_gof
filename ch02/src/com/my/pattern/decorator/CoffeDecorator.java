package com.my.pattern.decorator;

public abstract class CoffeDecorator implements Coffee {

    private Coffee coffee;

    public CoffeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String recipe() {
       return this.coffee.recipe();
    }
}
