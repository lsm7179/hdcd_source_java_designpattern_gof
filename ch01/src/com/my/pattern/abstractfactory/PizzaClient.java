package com.my.pattern.abstractfactory;

public class PizzaClient {
    public static void main(String[] args) {
        PizzaFactory cheezePizzaFactory = new CheesePizzaFactory();
        PizzaFactory baconPizzaFactory = new BaconPizzaFactory();
        PizzaFactory seafoodPizzaFactory = new SeafoodPizzaFactory();
        Pizza cheesePizza = cheezePizzaFactory.create();
        Pizza baconPizza = baconPizzaFactory.create();
        Pizza seafoodPizza = seafoodPizzaFactory.create();

        cheesePizza.print();
        baconPizza.print();
        seafoodPizza.print();
    }
}
