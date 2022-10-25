package com.bsb.calc.state;

public interface IState {

	public void action(IContext context, String actionCommand);

}
