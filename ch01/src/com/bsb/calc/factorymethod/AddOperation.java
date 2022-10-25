package com.bsb.calc.factorymethod;

public class AddOperation extends AbstractOperation {

	@Override
	protected AbstractOperator getOperator() {
		return new AddOperator();
	}

}
