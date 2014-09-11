/**
 * 
 */
package com.designmode.Adapter;

/**
 * @author DamonTung
 * @date 2014年9月9日
 * @description 
 */
public class TestWrapper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source source = new Source();
		Targetable targetable = new Wrapper(source);
		targetable.method1();
		targetable.method2();
	}

}
