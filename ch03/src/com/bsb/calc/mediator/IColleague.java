package com.bsb.calc.mediator;

public interface IColleague {

	public void setMediator(IMediator mediator);

	public abstract void printAnswer(int answer);
	
	public abstract int getFirstNumber();

	public abstract int getSecondeNumber();

}
