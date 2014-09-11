/**
 * 
 */
package com.designmode.AbstractFactory;

/**
 * @author DamonTung
 * @date 2014年9月9日
 * @description
 */
public class MailSender implements Sender {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designmode.AbstractFactory.Sender#send()
	 */
	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("this is MailSender of AbstractFactory ...");
	}

}
