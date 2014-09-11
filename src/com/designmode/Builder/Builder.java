/**
 * 
 */
package com.designmode.Builder;

import java.util.ArrayList;

/**
 * @author DamonTung
 * @date 2014年9月9日
 * @description
 */
public class Builder {
	private ArrayList<Sender> list = new ArrayList<Sender>();

	/**
	 * @return the list
	 */
	public ArrayList<Sender> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<Sender> list) {
		this.list = list;
	}

	/**
	 * 工厂模式关注与创建单个产品，而建造者模式关注创建多个对象；
	 */
	public Builder() {
		// TODO Auto-generated constructor stub
	}

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}
}
