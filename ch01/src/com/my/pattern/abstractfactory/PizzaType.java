package com.my.pattern.abstractfactory;

public enum PizzaType {

    cheese("치즈"), bacon("베이컨"), seafood("씨푸드");

    private final String name;

    private PizzaType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
