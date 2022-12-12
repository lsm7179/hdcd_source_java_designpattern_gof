package com.my.pattern.command;

public class PowerOffButton implements ButtonCommand{
    @Override
    public void run() {
        System.out.println("파워를 끔");
    }
}
