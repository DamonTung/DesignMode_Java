/**
 * 
 */
package com.designmode.Memento;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public class Memento {
	private String valueString;

	public Memento(String valueString) {
		super();
		this.valueString = valueString;
	}

	public String getValueString() {
		return valueString;
	}

	public void setValueString(String valueString) {
		this.valueString = valueString;
	}

}
