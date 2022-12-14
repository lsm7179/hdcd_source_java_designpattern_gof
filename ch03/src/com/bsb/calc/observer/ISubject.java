package com.bsb.calc.observer;

public interface ISubject {

	public void notifyObservers();

	public void registerObserver(AbstractOperationObserver oberver);

	public void removeObserver(AbstractOperationObserver oberver);

}
