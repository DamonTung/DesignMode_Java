/**
 * 
 */
package com.designmode.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author DamonTung
 * @date 2014年9月9日
 * @description
 */
public class Prototype implements Cloneable {
	private static final long serialVersionUID = 1L;
	private String string;
	private SerializableObject obj;

	/**
	 * @return the obj
	 */
	public SerializableObject getObj() {
		return obj;
	}

	/**
	 * @param obj
	 *            the obj to set
	 */
	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}

	/**
	 * @return the string
	 */
	public String getString() {
		return string;
	}

	/**
	 * @param string
	 *            the string to set
	 */
	public void setString(String string) {
		this.string = string;
	}

	/** Cloneable 为空接口，关键在于super.clone()方法的调用，实现了浅复制 */
	public Object clone() throws CloneNotSupportedException {
		Prototype prototype = (Prototype) super.clone();
		return prototype;
	}

	/** 实现深复制，以流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象 */
	public Object deepClone() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);

		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	class SerializableObject implements Serializable {
		private static final long serialVersionUID = 1L;

	}
}
