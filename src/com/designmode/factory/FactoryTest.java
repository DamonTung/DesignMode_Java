/**
 * 
 */
package com.designmode.factory;

/**
 * @author DamonTung 2014年9月9日
 */
public class FactoryTest {

	public static void main(String args[]) {
		/*SenderFactory factory = new SenderFactory();
		Sender sender = factory.produce("SmS");
		sender.send();

		Sender sender2 = factory.produce("MaiL");
		sender2.send();*/
		Sender sender = SenderFactory3.produceMail();
		sender.send();
	}
}
