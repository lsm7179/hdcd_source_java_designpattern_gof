package com.bsb.calc.facade;

public class NumberOperand {
	String value;

	public NumberOperand(String value) {
		this.value = value;
	}

	public int getNumber() {
		return Integer.parseInt(this.value);
	}
}
