package avl_trees;

import java.lang.reflect.Array;

public class AVLTree {
	
	private Node root;

	public AVLTree(Node root) {
		this.root = root;
	}

	/**
	 * Searches for a value in the tree
	 * 
	 * @param node is a node value in the tree
	 * @return true if the node is in the tree
	 */
	public boolean searchTree(Node node, int val) {
		if (node == null) {
			return false;
		}
		
		// return true if node was found
		if (node.getVal() == val) {
			return true;
		}
		
		if (searchTree(node.getRight(), val)) {
			return true;
		}
		
		if (searchTree(node.getLeft(), val)) {
			return true;
		}
		
		return false;
	}

	/**
	 * 
	 * @return
	 */
	public void insertNode() {
		if () {
			
		}
	}

	public boolean removeNode() {
		return false;
	}

	/**
	 * @return an array string representation of a tree
	 */
	public String toString() {
		return "";
	}

	private class Node {
		public Node left;
		public Node right;
		public int value;
		public int height;

		public Node(int value) {
			this.left = null;
			this.right = null;
			this.value = value;
			this.height = 1; // Every node has the height of one
		}

		public void setLeft(Node node) {
			this.left = node;
		}
		
		public void setRight(Node node) {
			this.right = node;
		}

		public Node getLeft() {
			return this.left;
		}
		
		public Node getRight() {
			return this.right;
		}

		public int getVal() {
			return this.value;
		}

	}

}
