package com.my.pattern.strategy;

public class PdfSaving implements SavingStrategy {
    @Override
    public void save() {
        System.out.println("pdf로 저장 합니다.");
    }
}
