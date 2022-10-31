package com.my.pattern.proxy;

public class Client {
    public static void main(String[] args) {
        System.out.println("자전거를 타보겠습니다.");

        Bicycle bicycle = new ProxyBicyle();

        bicycle.ride();
    }
}
