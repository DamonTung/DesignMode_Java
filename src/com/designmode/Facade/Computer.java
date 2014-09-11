/**
 * 
 */
package com.designmode.Facade;

/**
 * @author DamonTung
 * @date 2014年9月10日
 * @description 外观模式，将类之间的相互关系存放与此，拥有其他类的实例，降低类之间的耦合度；
 */
public class Computer {
	private Cpu cpu;
	private Memory memory;
	private Disk disk;
	
	public Computer(){
		this.cpu = new Cpu();
		this.memory = new Memory();
		this.disk = new Disk();
	}
	
	public void startUp(){
		System.out.println("===computer is starting...===");
		cpu.startUp();
		memory.startUp();
		disk.startUp();
		System.out.println("===Computer startUp...===\n");
	}
	
	public void shutDown(){
		System.out.println("===computer is shutdown ...===");
		cpu.shutDown();
		memory.shutDown();
		disk.shutDown();
		System.out.println("===computer shutDown...===");
	}
}
