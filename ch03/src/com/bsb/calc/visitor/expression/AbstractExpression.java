package com.bsb.calc.visitor.expression;

import com.bsb.calc.visitor.AbstractVisitor;

public abstract class AbstractExpression {

	public abstract int operate();

	public void accept(AbstractVisitor v) {

	}

}
