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
public class TestBuilder {

	/**
	 * 
	 */
	public TestBuilder() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countNum = 10;
		Builder builder = new Builder();
		builder.produceMailSender(countNum);
		ArrayList<Sender> arrayList = builder.getList();
		for(int i = 0; i < countNum; i++){
			arrayList.get(i).send();
		}
	}

}
