package com.my.pattern.proxy;

public class DiamondbackBicycle implements Bicycle {
    @Override
    public void ride() {
        System.out.println("다이아몬드백 자전거 타는 중");
    }
}
