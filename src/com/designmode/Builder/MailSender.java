/**
 * 
 */
package com.designmode.Builder;

/**
 * @author DamonTung
 * @date 2014年9月9日
 * @description 
 */
public class MailSender implements Sender {

	/* (non-Javadoc)
	 * @see com.designmode.Builder.Sender#send()
	 */
	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("this is mailsender of builder ...");
	}

}
