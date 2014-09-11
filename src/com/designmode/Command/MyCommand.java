/**
 * 
 */
package com.designmode.Command;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public class MyCommand implements Command {
	private Receiver receiver;

	public MyCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designmode.Command.Command#exe()
	 */
	@Override
	public void exe() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}
