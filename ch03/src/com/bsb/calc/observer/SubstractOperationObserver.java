package com.bsb.calc.observer;

public class SubstractOperationObserver extends AbstractOperationObserver {

	public SubstractOperationObserver(OperationSubject operationSubject) {
		super(operationSubject);
	}

	@Override
	public void update() {
		int firstNumber = getFirstNumber();
		int secondNumber = getSecondNumber();

		int answer = firstNumber - secondNumber;

		System.out.println(firstNumber + " - " + secondNumber + " = " + answer);
	}

}
