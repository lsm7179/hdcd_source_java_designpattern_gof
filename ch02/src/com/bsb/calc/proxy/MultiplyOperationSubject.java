package com.bsb.calc.proxy;

public class MultiplyOperationSubject extends AbstractOperationSubject {

	@Override
	public int operate(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

}
