/**
 * 
 */
package com.designmode.Iterator;



/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public interface Collection {
	public Iterator iterator();

	public Object getObject(int i);

	public int size();
}
