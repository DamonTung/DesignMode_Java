/**
 * 
 */
package com.designmode.Interpret;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description 
 */
public class TestInterpret {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context(23, 76);
		Plus plus = new Plus();
		Minus minus = new Minus();
		int plusResult = plus.interpret(context);
		int minusResult = minus.interpret(context);
		
		System.out.println("plusResult is :" + plusResult);
		System.out.println("minusResult is : " + minusResult);
	}

}
