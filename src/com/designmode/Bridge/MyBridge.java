/**
 * 
 */
package com.designmode.Bridge;

/**
 * @author DamonTung
 * @date 2014年9月10日
 * @description
 */
public class MyBridge extends Bridge {
	public void method() {
		getSourceable().method();
	}
}
