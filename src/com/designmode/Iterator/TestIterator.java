/**
 * 
 */
package com.designmode.Iterator;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public class TestIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection collection = new MyCollection();
		Iterator iterator = collection.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
