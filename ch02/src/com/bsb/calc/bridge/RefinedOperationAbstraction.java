package com.bsb.calc.bridge;

public class RefinedOperationAbstraction extends OperationAbstraction {

	public RefinedOperationAbstraction(IBaseOperationImplementor impl) {
		super(impl);
	}

	public int sqrt(int a) {
		return (int) Math.sqrt(a);
	}

	public int pow(int a, int b) {
		return (int) Math.pow(a, b);
	}

}
