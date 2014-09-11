/**
 * 
 */
package com.designmode.Decorator;

/**
 * @author DamonTung
 * @date 2014年9月9日
 * @description 装饰类，与被装饰类继承同一接口，持有被装饰类的一个实例，动态添加一些功能；
 */
public class Decorator implements Sourceable {
	private Source source;
	public Decorator(Source source){
		super();
		this.source = source;
	}
	/* (non-Javadoc)
	 * @see com.designmode.Decorator.Sourceable#method()
	 */
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before decorator ...");
		source.method();
		System.out.println("after decorator ...");
	}

}
