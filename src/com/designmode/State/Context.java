/**
 * 
 */
package com.designmode.State;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public class Context {
	private State state;

	public Context(State state) {
		super();
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void method() {
		if (state.getValueString().equalsIgnoreCase("first")) {
			state.method1();
		} else if (state.getValueString().equalsIgnoreCase("second")) {
			state.method2();
		} else {
			System.out.println("没有对应状态可执行！！");
		}
	}
}
