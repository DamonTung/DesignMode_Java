/**
 * 访问者模式适用于数据结构相对稳定的系统，把数据结构和算法解耦和；
 */
package com.designmode.Visitor;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description 
 */
public class TestVisitor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitor visitor = new MyVisitor();
		Subject subject = new MySubject();
		subject.accept(visitor);
		
	}

}
