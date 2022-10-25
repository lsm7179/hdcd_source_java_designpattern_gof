package com.bsb.calc.decorator;

import com.bsb.calc.decorator.AbstractExpression;

public class PowDecoratorExpression extends AbstractDecoratorExpression{
	
	private int exponent = 2;
	
	public PowDecoratorExpression(){
		super();
	}
	
	public PowDecoratorExpression(AbstractExpression expression, int exponent){
		super(expression);
		
		this.exponent = exponent;
	}
	
	@Override
	public double operate(){		
		return Math.pow(this.expression.operate(), exponent);
	}
	
}
