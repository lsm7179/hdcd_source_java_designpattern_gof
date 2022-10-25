package com.bsb.calc.decorator;

import com.bsb.calc.decorator.AbstractExpression;

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

}
