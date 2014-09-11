/**
 * 
 */
package com.designmode.Memento;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public class Orignial {
	private String value;

	public Orignial(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Memento createMemento() {
		return new Memento(value);
	}

	public void restoreMemento(Memento memento) {
		this.value = memento.getValueString();
	}
}
