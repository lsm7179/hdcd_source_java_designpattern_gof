package com.bsb.calc.visitor.expression;

public class NumberExpression extends AbstractExpression {

	private int value;

	public NumberExpression(int value) {
		this.value = value;
	}

	@Override
	public int operate() {
		return this.value;
	}

}
