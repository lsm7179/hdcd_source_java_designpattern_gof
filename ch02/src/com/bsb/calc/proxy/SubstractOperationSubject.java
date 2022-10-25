package com.bsb.calc.proxy;

public class SubstractOperationSubject extends AbstractOperationSubject {
	
	@Override
	public int operate(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}
	
}
