/**
 * 
 */
package com.designmode.Singleton;

/**
 * @author DamonTung
 * @date 2014年9月9日
 * @description
 */
public class Singleton {
	/* 私有构造方法，防止该类的实例化 */
	private Singleton() {

	}

	/** 静态内部类维护单例 */
	private static class SingletonFactory {
		private static Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonFactory.instance;
	}

	/** 保证该对象在序列化前后的一致性 */
	public Object readResolve() {
		return getInstance();
	}
}
