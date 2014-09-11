/**
 * 
 */
package com.designmode.TemplateMethod;

/**
 * @author DamonTung
 * @date 2014年9月10日
 * @description 
 */
public class Plus extends AbstractCalculator {

	/* (non-Javadoc)
	 * @see com.designmode.TemplateMethod.AbstractCalculator#calculator(int, int)
	 */
	@Override
	public int calculator(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

}
