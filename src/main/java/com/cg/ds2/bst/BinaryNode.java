package com.cg.ds2.bst;

public class BinaryNode<K extends Comparable<K>> {
	private K key;
	private BinaryNode<K> left;
	private BinaryNode<K> right;

	public BinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

	public K getKey() {
		return key;
	}

	public BinaryNode<K> getLeft() {
		return left;
	}

	public BinaryNode<K> getRight() {
		return right;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public void setLeft(BinaryNode<K> left) {
		this.left = left;
	}

	public void setRight(BinaryNode<K> right) {
		this.right = right;
	}
	
}
