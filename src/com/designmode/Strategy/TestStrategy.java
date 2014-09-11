/**
 * 策略模式，系统提供算法的封装，有用户决定使用哪一个算法；
 */
package com.designmode.Strategy;

/**
 * @author DamonTung
 * @date 2014年9月10日
 * @description
 */
public class TestStrategy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "2+34";
		String exp1 = "33-21";
		String exp2 = "3*8";
		ICalculator calculator = new Plus();
		int result = calculator.calculator(exp);
		System.out.println(exp + " = " + result);

		ICalculator calculator2 = new Minus();
		int result2 = calculator2.calculator(exp1);
		System.out.println(exp1 + " = " + result2);

		ICalculator calculator3 = new Multiply();
		int result3 = calculator3.calculator(exp2);
		System.out.println(exp2 + " = " + result3);
	}

}
