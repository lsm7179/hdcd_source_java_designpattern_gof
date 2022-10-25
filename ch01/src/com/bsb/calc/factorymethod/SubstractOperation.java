package com.bsb.calc.factorymethod;

public class SubstractOperation extends AbstractOperation {
	
	@Override
	protected AbstractOperator getOperator() {
		return new SubstractOperator();
	}
	
}
