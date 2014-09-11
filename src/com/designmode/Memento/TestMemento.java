/**
 * 
 */
package com.designmode.Memento;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public class TestMemento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orignial orignial = new Orignial("DamonTung");
		Storage storage = new Storage(orignial.createMemento());

		System.out.println("原始状态为：" + orignial.getValue());
		orignial.setValue("SIPAI");
		System.out.println("修改后的状态为：" + orignial.getValue());

		orignial.restoreMemento(storage.getMemento());
		System.out.println("恢复原始状态为：" + orignial.getValue());
	}

}
