package com.bsb.calc.proxy;

public class DivideOperationProxy extends AbstractOperationSubject {

	private AbstractOperationSubject realOperationSubject;

	public DivideOperationProxy(AbstractOperationSubject realOperationSubject) {
		this.realOperationSubject = realOperationSubject;
	}

	@Override
	public int operate(int firstNumber, int secondNumber) throws OperationException {
		if (secondNumber == 0) {
			throw new OperationException("NonZeroDivideException");
		}

		return realOperationSubject.operate(firstNumber, secondNumber);
	}

}
