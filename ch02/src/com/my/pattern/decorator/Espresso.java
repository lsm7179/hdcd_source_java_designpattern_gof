package com.my.pattern.decorator;

public class Espresso implements Coffee {

    @Override
    public String print() {
        return "에스프레소";
    }
}
