package com.my.pattern.command;

public class ChannelUpButton implements ButtonCommand{
    @Override
    public void run() {
        System.out.println("채널 위로 올림");
    }
}
