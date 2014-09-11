/**
 * 命令模式，达到命令者与执行者的解耦，实现请求与执行分开；
 */
package com.designmode.Command;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public class TestCommand {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver receiver = new Receiver();
		Command cmd = new MyCommand(receiver);
		Invoker invoker = new Invoker(cmd);

		invoker.action();

	}

}
