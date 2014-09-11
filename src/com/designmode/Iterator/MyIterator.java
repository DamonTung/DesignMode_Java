/**
 * 
 */
package com.designmode.Iterator;

import javax.swing.text.Position;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public class MyIterator implements Iterator {
	private Collection collection;
	private int _pos = -1;

	/**
	 * 
	 */
	public MyIterator(Collection collection) {
		// TODO Auto-generated constructor stub
		this.collection = collection;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designmode.Iterator.Iterator#previous()
	 */
	@Override
	public Object previous() {
		// TODO Auto-generated method stub
		if (_pos > 0) {
			_pos--;
			return collection.getObject(_pos);
		} else
			return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designmode.Iterator.Iterator#next()
	 */
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if (_pos < (collection.size() - 1)) {
			_pos++;
		}
		return collection.getObject(_pos);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designmode.Iterator.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (_pos < (collection.size() - 1)) {
			return true;
		} else {

			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designmode.Iterator.Iterator#first()
	 */
	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return collection.getObject(0);
	}

}
