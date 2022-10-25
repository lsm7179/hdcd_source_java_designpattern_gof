package com.bsb.calc.decorator;

import java.util.ArrayList;

public abstract class AbstractOperationExpression extends AbstractExpression {

	protected ArrayList<AbstractExpression> operandList = new ArrayList<AbstractExpression>();

	public final void addOperandExpression(AbstractExpression operandExpression) {
		operandList.add(operandExpression);
	}

}
