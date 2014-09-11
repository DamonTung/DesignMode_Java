/**
 * 
 */
package com.designmode.Visitor;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description 
 */
public interface Subject {
	public void accept(Visitor visitor);
	public String getSubject();
}
