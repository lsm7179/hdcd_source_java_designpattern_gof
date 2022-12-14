package com.bsb.calc.iterator;

public class SubstractOperation extends AbstractOperation {

	@Override
	protected int getAnswer(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	@Override
	public void print(int firstNumber, int secondNumber) {
		int answer = getAnswer(firstNumber, secondNumber);

		System.out.println(firstNumber + " - " + secondNumber + " = " + answer);
	}
	
}
