/**
 * 
 */
package com.designmode.Iterator;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public class MyCollection implements Collection {
	private String string[] = { "A", "B", "C", "D", "E", "F" };

	/**
	 * 
	 */
	public MyCollection() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designmode.Iterator.Collection#iterator()
	 */
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyIterator(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designmode.Iterator.Collection#getObject(int)
	 */
	@Override
	public Object getObject(int i) {
		// TODO Auto-generated method stub
		return string[i];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designmode.Iterator.Collection#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return string.length;
	}

}
