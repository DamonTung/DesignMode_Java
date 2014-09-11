/**
 * 
 */
package com.designmode.Iterator;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public interface Iterator {
	/** 前移 */
	public Object previous();

	/** 后移 */
	public Object next();

	public boolean hasNext();

	public Object first();

}
