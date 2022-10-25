package com.bsb.calc.adapter;

public class AddOperation extends AbstractOperationTarget {

	@Override
	public int operate(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

}
