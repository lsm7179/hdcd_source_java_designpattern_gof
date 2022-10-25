package com.bsb.calc.templatemethod;

public class MultiplyOperation extends AbstractOperation {

	@Override
	protected int getAnswer(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	@Override
	protected String getOperator() {
		return "*";
	}

}
