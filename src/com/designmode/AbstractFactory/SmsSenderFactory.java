/**
 * 
 */
package com.designmode.AbstractFactory;

/**
 * @author DamonTung
 * @date 2014年9月9日
 * @description 
 */
public class SmsSenderFactory implements Provider {

	/* (non-Javadoc)
	 * @see com.designmode.AbstractFactory.Provider#produce()
	 */
	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
