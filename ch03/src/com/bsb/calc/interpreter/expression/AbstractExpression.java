package com.bsb.calc.interpreter.expression;

import com.bsb.calc.interpreter.CalcContext;
import com.bsb.calc.interpreter.CalcParseException;

public abstract class AbstractExpression {
	
	public abstract void parse(CalcContext context) throws CalcParseException;

	public abstract double operate();
	
}
