package com.bsb.calc.strategy;

public class AddOperationStrategy extends AbstractOperationStrategy {

	@Override
	public int getAnswer(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	@Override
	public String getOperator() {
		return "+";
	}

}
