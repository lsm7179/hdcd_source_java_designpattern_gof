package com.bsb.calc.factorymethod;

public class SubstractOperator extends AbstractOperator {

	@Override
	protected int getAnswer(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	@Override
	public String getDescription() {
		return "-";
	}
	
}
