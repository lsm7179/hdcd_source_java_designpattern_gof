package com.bsb.calc.proxy;

public abstract class AbstractOperationSubject {

	public abstract int operate(int firstNumber, int secondNumber) throws OperationException;

}
