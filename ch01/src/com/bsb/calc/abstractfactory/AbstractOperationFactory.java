package com.bsb.calc.abstractfactory;

public abstract class AbstractOperationFactory {

	public abstract AbstractOperationProduct createOperationProduct();
	
	public abstract AbstractNumberOperandProduct createNumberOperandProduct(String value);
	
}
