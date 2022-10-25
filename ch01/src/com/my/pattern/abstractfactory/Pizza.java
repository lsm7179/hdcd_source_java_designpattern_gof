package com.my.pattern.abstractfactory;

import java.math.BigInteger;

public abstract class Pizza {

    protected BigInteger price;
    protected PizzaType type;

    public void print() {
        System.out.println("이 피자는 "+type.getName()+"피자이며 가격은 "+price+"원 입니다.");
    }

}

class CheesePizza extends Pizza {

    public CheesePizza() {
        this.price = new BigInteger("8000");
        this.type = PizzaType.cheese;
    }
}

class BaconPizza extends Pizza {

    public BaconPizza() {
        this.price = new BigInteger("10000");
        this.type = PizzaType.bacon;
    }
}

class SeafoodPizza extends Pizza {

    public SeafoodPizza() {
        this.price = new BigInteger("15000");
        this.type = PizzaType.seafood;
    }
}
