/**
 * 
 */
package com.designmode.Observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author DamonTung
 * @date 2014年9月10日
 * @description
 */
public abstract class AbstractSubject implements Subject {
	private Vector<Observer> vector = new Vector<Observer>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.designmode.Observer.Subject#add(com.designmode.Observer.Observer)
	 */
	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		vector.add(observer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.designmode.Observer.Subject#remove(com.designmode.Observer.Observer)
	 */
	@Override
	public void remove(Observer observer) {
		// TODO Auto-generated method stub
		vector.remove(observer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designmode.Observer.Subject#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		Enumeration<Observer> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			enumeration.nextElement().update();

		}
	}

	
}
