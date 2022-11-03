package com.my.pattern.strategy;

public abstract class Image {

    private SavingStrategy strategy;

    public void save() {
        strategy.save();
    }

    public void save(SavingStrategy savingStrategy) {
        savingStrategy.save();
    }

    public void setStrategy(SavingStrategy strategy) {
        this.strategy = strategy;
    }
}
