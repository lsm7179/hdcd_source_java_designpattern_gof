package com.my.pattern.decorator;

public abstract class CoffeeDecorator implements Coffee {

    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String recipe() {
       return this.coffee.recipe();
    }
}
