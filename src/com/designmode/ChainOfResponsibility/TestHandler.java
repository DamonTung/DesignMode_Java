/**
 * 有多个对象，每个对象持有对另外一个对象的引用，从而形成一条传递请求的链
 */
package com.designmode.ChainOfResponsibility;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public class TestHandler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHandler h1 = new MyHandler("H1");
		MyHandler h2 = new MyHandler("H2");
		MyHandler h3 = new MyHandler("H3");

		h1.setHandler(h3);
		h3.setHandler(h2);

		h1.operator();
	}

}
