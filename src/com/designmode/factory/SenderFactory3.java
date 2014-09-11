/**
 * 
 */
package com.designmode.factory;

/**
 * @author DamonTung
 * @date 2014年9月9日
 * @description 静态工厂方法模式，将工厂方法设置为静态，避免了工厂类的实例化，直接调用工厂方法；
 */
public class SenderFactory3 {
	static Sender produceMail() {
		return new MailSender();
	}

	static Sender produceSms() {
		return new SmsSender();
	}
}
