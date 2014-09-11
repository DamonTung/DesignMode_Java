/**
 * 
 */
package com.designmode.factory;

/**
 * @author DamonTung 2014年9月9日
 * 提供多个工厂方法模式，分别创建对象,避免普通工厂方法模式中参数传递出错而不能正确创建对象；
 */
public class SenderFactory2 {
	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}
}
