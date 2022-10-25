package com.bsb.calc.decorator;

public class MultiplyOperationExpression extends AbstractOperationExpression {

	@Override
	public double operate() {
		AbstractExpression firstOperandExpression = operandList.get(0);
		AbstractExpression secondOperandExpression = operandList.get(1);

		double firstResult = firstOperandExpression.operate();
		double secondResult = secondOperandExpression.operate();

		return firstResult * secondResult;
	}

}
