package com.my.pattern.command;

public class Client {

    public static void main(String[] args) {
        Remote 리모컨 = new Remote();
        ButtonCommand powerOnButton = new PowerOnButton();
        ButtonCommand powerOffButton = new PowerOffButton();
        ButtonCommand channelUpButton = new ChannelUpButton();
        ButtonCommand channelDownButton = new ChannelDownButton();

        리모컨.setCommand(powerOnButton);
        리모컨.buttonPress();

        리모컨.setCommand(channelUpButton);
        리모컨.buttonPress();

        리모컨.setCommand(channelDownButton);
        리모컨.buttonPress();

        리모컨.setCommand(powerOffButton);
        리모컨.buttonPress();
    }
}
