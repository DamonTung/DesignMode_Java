/**
 * 
 */
package com.designmode.Mediator;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description 
 */
public class User1 extends User {

	public User1(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.designmode.Mediator.User#work()
	 */
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("user1 exe...");
	}

}
