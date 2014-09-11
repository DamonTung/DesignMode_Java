/**
 * 
 */
package com.designmode.Strategy;

/**
 * @author DamonTung
 * @date 2014年9月10日
 * @description 
 */
public class Plus extends AbstractCalculator implements ICalculator {

	/* (non-Javadoc)
	 * @see com.designmode.Strategy.ICalculator#calculator(java.lang.String)
	 */
	@Override
	public int calculator(String exp) {
		// TODO Auto-generated method stub
		int arrayInt[] = split(exp, "\\+");
		return arrayInt[0]+arrayInt[1];
	}

}
