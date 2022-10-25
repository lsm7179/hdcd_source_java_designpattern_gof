package com.bsb.calc.command;

public class DivideOperationCommand extends AbstractOperationCommand {

	public DivideOperationCommand(OperationCommandReceiver receiver, int value) {
		super(receiver, value);
	}

	@Override
	public void execute() {
		receiver.divide(value);
	}

}
