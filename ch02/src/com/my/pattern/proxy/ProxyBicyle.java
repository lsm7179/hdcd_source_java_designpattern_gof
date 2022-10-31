package com.my.pattern.proxy;

import java.util.Objects;

public class ProxyBicyle implements Bicycle {
    private Bicycle bicycle;

    @Override
    public void ride() {
        if(Objects.isNull(bicycle)){
            System.out.println("다이아몬드 자전거는 프록시에서 생성됨");
            bicycle = new DiamondbackBicycle();
        }
        bicycle.ride();
    }
}
