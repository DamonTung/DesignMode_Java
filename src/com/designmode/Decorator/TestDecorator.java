/**
 * 
 */
package com.designmode.Decorator;

/**
 * @author DamonTung
 * @date 2014年9月9日
 * @description 
 */
public class TestDecorator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source source = new Source();
		Decorator decorator = new Decorator(source);
		source.method();
		decorator.method();
	}

}
