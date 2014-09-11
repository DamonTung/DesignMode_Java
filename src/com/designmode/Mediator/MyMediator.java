/**
 * 
 */
package com.designmode.Mediator;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description 
 */
public class MyMediator implements Mediator {
	private User1 user1;
	private User2 user2;

	public User1 getUser1() {
		return user1;
	}

	public User2 getUser2() {
		return user2;
	}

	/* (non-Javadoc)
	 * @see com.designmode.Mediator.Mediator#createMediator()
	 */
	@Override
	public void createMediator() {
		// TODO Auto-generated method stub
		user1 = new User1(this);
		user2 = new User2(this);
	}

	/* (non-Javadoc)
	 * @see com.designmode.Mediator.Mediator#workAll()
	 */
	@Override
	public void workAll() {
		// TODO Auto-generated method stub
		user1.work();
		user2.work();
	}

}
