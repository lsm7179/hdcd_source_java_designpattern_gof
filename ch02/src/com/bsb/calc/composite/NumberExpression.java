package com.bsb.calc.composite;

public class NumberExpression extends AbstractExpression {

	private int value;

	public NumberExpression(int value) {
		this.value = value;
	}

	@Override
	public int operate() {
		return value;
	}

}
