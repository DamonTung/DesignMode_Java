/**
 * 
 */
package com.designmode.Proxy;

import org.junit.After;
import org.junit.Before;

/**
 * @author DamonTung
 * @date 2014年9月10日
 * @description 与装饰器模式的区别是，代理模式中的实例是在构造代理类是直接生成的， 而装饰器模式是将实例作为参数传递过来的；
 */
public class Proxy implements Sourceable {
	private Source source;

	public Proxy() {
		super();
		this.source = new Source();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designmode.Proxy.Sourceable#method()
	 */
	@Override
	public void method() {
		// TODO Auto-generated method stub
		before();
		source.method();
		after();
	}
	private void before(){
		System.out.println("this is before of source.method() ...");
	}
	private void after(){
		System.out.println("this is after of source.method ...");
	}

}
