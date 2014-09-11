/**
 * 
 */
package com.designmode.State;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public class State {
	private String valueString;

	public String getValueString() {
		return valueString;
	}

	public void setValueString(String valueString) {
		this.valueString = valueString;
	}

	public void method1() {
		System.out.println("execute the first method ...");
	}

	public void method2() {
		System.out.println("execute the second method ...");
	}
}
