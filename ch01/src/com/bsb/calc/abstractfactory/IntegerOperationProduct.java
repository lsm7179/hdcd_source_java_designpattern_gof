package com.bsb.calc.abstractfactory;

public class IntegerOperationProduct extends AbstractOperationProduct{

	@Override
	public void print() {
		double firstNumber = getFirstNumber();
		double secondNumber = getSecondNumber();
		
		System.out.println((int)firstNumber + " + " + (int)secondNumber + " = " + (int)add());
		System.out.println((int)firstNumber + " - " + (int)secondNumber + " = " + (int)substract());
		System.out.println((int)firstNumber + " * " + (int)secondNumber + " = " + (int)multiply());
		System.out.println((int)firstNumber + " / " + (int)secondNumber + " = " + (int)divide());
	}

}
