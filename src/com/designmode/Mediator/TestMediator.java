/**
 * 
 */
package com.designmode.Mediator;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public class TestMediator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}

}
