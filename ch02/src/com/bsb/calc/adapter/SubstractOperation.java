package com.bsb.calc.adapter;

public class SubstractOperation extends AbstractOperationTarget {
	
	@Override
	public int operate(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}
	
}
