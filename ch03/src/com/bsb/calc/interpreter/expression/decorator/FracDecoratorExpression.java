package com.bsb.calc.interpreter.expression.decorator;

import com.bsb.calc.interpreter.expression.AbstractExpression;

public class FracDecoratorExpression extends AbstractDecoratorExpression{
	
	public FracDecoratorExpression(){
		super();
	}
	
	public FracDecoratorExpression(AbstractExpression expression){
		super(expression);
	}
	
	@Override
	public double operate(){				
		return 1 / expression.operate();
	}

	@Override
	protected String getFunctionName() {
		return "FRAC";
	}
	
}
