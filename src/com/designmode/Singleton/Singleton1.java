/**
 * 
 */
package com.designmode.Singleton;

/**
 * @author DamonTung
 * @date 2014年9月9日
 * @description
 */
public class Singleton1 {
	private static Singleton1 instance = null;

	/**
	 * 
	 */
	private Singleton1() {
		// TODO Auto-generated constructor stub
	}

	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new Singleton1();
		}
	}

	public static Singleton1 getInstance() {
		if (instance == null) {
			syncInit();
		}

		return instance;
	}

}
