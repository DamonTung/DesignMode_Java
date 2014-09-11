/**
 * 
 */
package com.designmode.TemplateMethod;

/**
 * @author DamonTung
 * @date 2014年9月10日
 * @description
 */
public class TestTemplateMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expString = "33+88";
		AbstractCalculator aCalculator = new Plus();
		int result = aCalculator.calculator(expString, "\\+");
		System.out.println(expString + " = " + result);
	}

}
