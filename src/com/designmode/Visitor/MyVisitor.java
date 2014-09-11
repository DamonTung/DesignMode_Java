/**
 * 
 */
package com.designmode.Visitor;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description 
 */
public class MyVisitor implements Visitor {

	/* (non-Javadoc)
	 * @see com.designmode.Visitor.Visitor#visitor(com.designmode.Visitor.Subject)
	 */
	@Override
	public void visitor(Subject subject) {
		// TODO Auto-generated method stub
		System.out.println("visit the subject : " + subject.getSubject());
	}

}
