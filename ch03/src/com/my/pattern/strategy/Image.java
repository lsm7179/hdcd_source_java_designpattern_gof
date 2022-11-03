package com.my.pattern.strategy;

import java.util.Objects;

public abstract class Image {

    private SavingStrategy strategy;

    public void save() {
        if(Objects.isNull(strategy)){
            System.out.println("저장방식이 없습니다.");
            return;
        }
        strategy.save();
    }

    public void setStrategy(SavingStrategy strategy) {
        this.strategy = strategy;
    }
}
