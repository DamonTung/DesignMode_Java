/**
 * 
 */
package com.designmode.Observer;

/**
 * @author DamonTung
 * @date 2014年9月10日
 * @description
 */
public interface Subject {
	public void add(Observer observer);

	public void remove(Observer observer);

	public void notifyObservers();

	public void operation();
}
