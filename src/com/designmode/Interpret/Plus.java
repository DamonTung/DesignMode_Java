/**
 * 
 */
package com.designmode.Interpret;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description 
 */
public class Plus implements Expression {

	/* (non-Javadoc)
	 * @see com.designmode.Interpret.Expression#interpret(com.designmode.Interpret.Context)
	 */
	@Override
	public int interpret(Context context) {
		// TODO Auto-generated method stub
		return context.getNum1() + context.getNum2();
	}

}
