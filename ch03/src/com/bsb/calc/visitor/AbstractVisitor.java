package com.bsb.calc.visitor;

import com.bsb.calc.visitor.expression.AbstractExpression;

public abstract class AbstractVisitor {

	public abstract void visit(AbstractExpression expression);

}
