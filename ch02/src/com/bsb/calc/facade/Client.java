package com.bsb.calc.facade;

public class Client {

	public static void main(String[] args) throws Exception {
		CalculatorFacade calculator = new CalculatorFacade();

		String[] expressions = { "100+20", "100-20", "100*20", "100/20" };

		for (int i = 0; i < expressions.length; i++) {
			calculator.calculate(expressions[i]);
		}
	}

}
