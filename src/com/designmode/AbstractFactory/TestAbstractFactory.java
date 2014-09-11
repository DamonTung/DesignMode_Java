/**
 * 
 */
package com.designmode.AbstractFactory;

/**
 * @author DamonTung
 * @date 2014年9月9日
 * @description 抽象工厂模式的优势是易扩展性，做一个实现类，实现sender接口，
 *              然后做一个工厂类，实现provider接口，不需要修改原有代码；
 */
public class TestAbstractFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender sender = new MailSenderFactory().produce();
		sender.send();

		new SmsSenderFactory().produce().send();
	}

}
