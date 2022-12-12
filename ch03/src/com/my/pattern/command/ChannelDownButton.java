package com.my.pattern.command;

public class ChannelDownButton implements ButtonCommand{
    @Override
    public void run() {
        System.out.println("채널 아래로 내림");
    }
}

