/**
 * 组合模式，也称整体-部分 模式，将多个对象组合在一起进行操作
 */
package com.designmode.Composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author DamonTung
 * @date 2014年9月10日
 * @description
 */
public class TreeNode {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	private TreeNode parent;
	private Vector<TreeNode> children = new Vector<TreeNode>();

	/**
	 * 
	 */
	public TreeNode(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void add(TreeNode node) {
		children.add(node);
	}

	public void remove(TreeNode node) {
		children.remove(node);
	}

	public Enumeration<TreeNode> getChildren() {
		return children.elements();
	}

}
