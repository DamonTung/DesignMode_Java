/**
 * 
 */
package com.designmode.Bridge;

/**
 * @author DamonTung
 * @date 2014年9月10日
 * @description
 */
public class TestBridge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bridge bridge = new MyBridge();

		SourceSub1 sourceSub1 = new SourceSub1();
		bridge.setSourceable(sourceSub1);
		bridge.method();

		SourceSub2 sourceSub2 = new SourceSub2();
		bridge.setSourceable(sourceSub2);
		bridge.method();
	}

}
