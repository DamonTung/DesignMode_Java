/**
 * 
 */
package com.designmode.TemplateMethod;

import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;

/**
 * @author DamonTung
 * @date 2014年9月10日
 * @description
 */
public abstract class AbstractCalculator {
	public final int calculator(String exp, String opt) {
		int array[] = split(exp, opt);
		return calculator(array[0], array[1]);
	}

	abstract public int calculator(int num1, int num2);

	/**
	 * @param exp
	 * @param opt
	 * @return
	 */
	private int[] split(String exp, String opt) {
		// TODO Auto-generated method stub
		String array[] = exp.split(opt);
		int[] arrayInt = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}

}
