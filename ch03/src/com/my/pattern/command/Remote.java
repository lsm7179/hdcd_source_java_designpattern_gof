package com.my.pattern.command;

public class Remote {
    private ButtonCommand command;

    public Remote() {
    }

    public ButtonCommand getCommand() {
        return command;
    }

    public void setCommand(ButtonCommand command) {
        this.command = command;
    }

    public void buttonPress() {
        System.out.println("버튼을 누름");
        command.run();
    }
}
