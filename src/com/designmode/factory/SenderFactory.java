/**
 * 
 */
package com.designmode.factory;

/**
 * @author DamonTung  普通工厂模式，对实现了同一接口的一些类进行实例的创建
 */
public class SenderFactory {
	public Sender produce(String type) {
		if ("mail".equalsIgnoreCase(type)) {
			return new MailSender();
		} else if ("sms".equalsIgnoreCase(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型！");
			return null;
		}
	}
}
