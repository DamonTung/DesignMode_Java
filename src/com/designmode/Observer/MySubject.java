/**
 * 
 */
package com.designmode.Observer;

/**
 * @author DamonTung
 * @date 2014年9月10日
 * @description
 */
public class MySubject extends AbstractSubject {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designmode.Observer.Subject#operation()
	 */
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("self update ...");
		notifyObservers();
	}

}
