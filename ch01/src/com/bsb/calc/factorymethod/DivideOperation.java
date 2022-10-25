package com.bsb.calc.factorymethod;

public class DivideOperation extends AbstractOperation {

	@Override
	protected AbstractOperator getOperator() {
		return new DivideOperator();
	}

}
