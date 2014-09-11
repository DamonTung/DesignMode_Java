/**
 * 
 */
package com.designmode.Observer;

/**
 * @author DamonTung
 * @date 2014年9月10日
 * @description
 */
public class TestObserver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new MySubject();
		subject.add(new Observer1());
		subject.add(new Observer2());
		subject.operation();
	}

}
