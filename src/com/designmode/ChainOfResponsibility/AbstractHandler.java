/**
 * 
 */
package com.designmode.ChainOfResponsibility;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public abstract class AbstractHandler {
	private Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

}
