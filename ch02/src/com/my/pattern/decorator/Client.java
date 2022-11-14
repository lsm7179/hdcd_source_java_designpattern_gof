package com.my.pattern.decorator;

public class Client {

    public static void main(String[] args) {
        System.out.print("에스프레소 레시피: ");

        Coffee espresso = new Espresso();
        System.out.println(espresso.print());


        System.out.print("아메리카노 레시피: ");
        Coffee americano = new Americano(new Espresso());
        System.out.println(americano.print());

        System.out.print("라떼 레시피: ");
        Coffee latte = new Latte(new Espresso());
        System.out.println(latte.print());


        System.out.print("바닐라라떼 레시피: ");
        Coffee vanillaLatte = new VanillaLatte(new Latte(new Espresso()));
        System.out.println(vanillaLatte.print());
    }
}
