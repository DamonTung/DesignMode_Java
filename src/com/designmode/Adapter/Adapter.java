/**
 * 
 */
package com.designmode.Adapter;

/**
 * @author DamonTung
 * @date 2014年9月9日
 * @description 类的适配器模式，消除由于接口不匹配造成的类的兼容性问题；
 */
public class Adapter extends Source implements Targetable {

	/* (non-Javadoc)
	 * @see com.designmode.Adapter.Targetable#method2()
	 */
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is targetable & adapter print ...");
	}

}
