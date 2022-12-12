package com.my.pattern.command;

public class PowerOnButton implements ButtonCommand {
    @Override
    public void run() {
        System.out.println("파워를 킴");
    }
}
