package com.cg.ds2;

public class Node<K extends Comparable<K>> implements INode<K> {
	private K key;
	private INode<K> next;

	public Node(K key) {
		this.key = key;
		this.next = null;
	}

	@Override
	public void setKey(K key) {
		// TODO Auto-generated method stub
		this.key = key;
	}

	@Override
	public void setNext(INode<K> next) {
		// TODO Auto-generated method stub
		this.next = next;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return this.key;
	}

	@Override
	public INode<K> getNext() {
		// TODO Auto-generated method stub
		return this.next;
	}

	@Override
	public String toString() {
		if (this.next == null)
			return this.key + "";
		return this.key + "->";
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof INode))
			return false;
		INode<K> n = (INode<K>) o;
		return this.getKey() == n.getKey();
	}

	@Override
	public int compareTo(INode<K> node) {
		return this.key.compareTo(node.getKey());
	}

}
