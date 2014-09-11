/**
 * 
 */
package com.designmode.Mediator;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public abstract class User {
	private Mediator mediator;

	public User(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public abstract void work();
}
