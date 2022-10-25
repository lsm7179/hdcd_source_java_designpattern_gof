package com.bsb.calc.proxy;

public class DivideOperationSubject extends AbstractOperationSubject {

	@Override
	public int operate(int firstNumber, int secondNumber) {
		return firstNumber / secondNumber;
	}

}
