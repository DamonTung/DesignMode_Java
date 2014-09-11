/**
 * 
 */
package com.designmode.Command;

/**
 * @author DamonTung
 * @date 2014年9月11日
 * @description
 */
public class Invoker {
	private Command command;

	public Invoker(Command command) {
		super();
		this.command = command;
	}

	public void action() {
		command.exe();
	}
}
