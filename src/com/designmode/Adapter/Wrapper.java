/**
 * 
 */
package com.designmode.Adapter;

/**
 * @author DamonTung
 * @date 2014年9月9日
 * @description 对象适配器模式，将对象的一个实例作为成员变量
 */
public class Wrapper implements Targetable {
	private Source source;
	public Wrapper(Source source){
		super();
		this.source = source;
	}
	/* (non-Javadoc)
	 * @see com.designmode.Adapter.Targetable#method1()
	 */
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		source.method1();
	}

	/* (non-Javadoc)
	 * @see com.designmode.Adapter.Targetable#method2()
	 */
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is method2 for the class of wrapper ...");
	}

}
