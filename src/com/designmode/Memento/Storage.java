/**
 * 
 */
package com.designmode.Memento;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public class Storage {
	private Memento memento;

	public Storage(Memento memento) {
		super();
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
