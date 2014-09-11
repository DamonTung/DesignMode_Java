/**
 * 
 */
package com.designmode.Bridge;

/**
 * @author DamonTung
 * @date 2014年9月10日
 * @description 
 */
public class Bridge {
	private Sourceable sourceable;
	
	public void method(){
		sourceable.method();
	}

	public Sourceable getSourceable() {
		return sourceable;
	}

	public void setSourceable(Sourceable sourceable) {
		this.sourceable = sourceable;
	}
}
