/**
 * 
 */
package com.designmode.ChainOfResponsibility;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public class MyHandler extends AbstractHandler implements Handler {
	private String nameString;

	public MyHandler(String nameString) {
		super();
		this.nameString = nameString;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.designmode.ChainOfResponsibility.Handler#operator()
	 */
	@Override
	public void operator() {
		// TODO Auto-generated method stub
		System.out.println(nameString + "deal !!");
		if(getHandler() != null){
			getHandler().operator();
		}
	}

}
