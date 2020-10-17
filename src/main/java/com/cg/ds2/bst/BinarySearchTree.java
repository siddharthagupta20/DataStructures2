package com.cg.ds2.bst;

public class BinarySearchTree<K extends Comparable<K>> {

	private BinaryNode<K> root;

	public BinarySearchTree() {
		root = null;
	}

	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	public BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
		if (current == null)
			return new BinaryNode<K>(key);
		if (current.getKey().compareTo(key) > 0)
			return this.addRecursively(current.getLeft(), key);
		else if (current.getKey().compareTo(key) < 0)
			return this.addRecursively(current.getRight(), key);
		else
			return current;

	}
	public int getSize() {
		return this.getSizeRecursively(root);
	}

	private int getSizeRecursively(BinaryNode<K> current) {
		return (current == null) ? 0 : 1 + this.getSizeRecursively(current.getLeft()) + this.getSizeRecursively(current.getRight());
	}

	public boolean search(K key) {
		return this.searchRecursively(root, key);
	}

	private boolean searchRecursively(BinaryNode<K> current, K key) {
		if(current == null)
			return false;
		int result = key.compareTo(current.getKey());
		if(result == 0)
			return true;
		if(result < 0)
			return searchRecursively(current.getLeft(), key);
		else
			return searchRecursively(current.getRight(), key);
	}

}
