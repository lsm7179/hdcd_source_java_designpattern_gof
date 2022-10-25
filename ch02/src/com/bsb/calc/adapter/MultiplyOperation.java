package com.bsb.calc.adapter;

public class MultiplyOperation extends AbstractOperationTarget {

	@Override
	public int operate(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

}
