/**
 * 状态模式，当对象状态改变时，同时改变其行为；
 */
package com.designmode.State;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public class TestState {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State state = new State();
		Context context = new Context(state);

		state.setValueString("first");
		context.method();

		state.setValueString("second");
		context.method();

		state.setValueString("sipai");
		context.method();
	}

}
