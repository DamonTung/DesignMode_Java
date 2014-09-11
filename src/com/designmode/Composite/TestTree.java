/**
 * 
 */
package com.designmode.Composite;

/**
 * @author DamonTung
 * @date 2014年9月10日
 * @description
 */
public class TestTree {

	/**
	 * 
	 */
	public TestTree() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");

		nodeB.add(nodeC);
		tree.rootNode.add(nodeB);

		System.out.println("build the tree finished ...");
	}

}
