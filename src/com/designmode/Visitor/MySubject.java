/**
 * 
 */
package com.designmode.Visitor;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description 
 */
public class MySubject implements Subject{

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitor(this);
	}

	@Override
	public String getSubject() {
		// TODO Auto-generated method stub
		return "SIPAI";
	}

}
