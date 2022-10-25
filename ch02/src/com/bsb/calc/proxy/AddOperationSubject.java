package com.bsb.calc.proxy;

public class AddOperationSubject extends AbstractOperationSubject {

	@Override
	public int operate(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

}
