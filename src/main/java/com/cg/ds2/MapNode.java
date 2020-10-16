package com.cg.ds2;

public class MapNode<K extends Comparable<K>, V> implements INode<K> {

	private K key;
	private V value;
	private MapNode<K, V> next;

	public MapNode(K key, V value) {
		this.key = key;
		this.value = value;
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

	public V getValue() {
		return value;
	}

	@Override
	public void setKey(K t) {
		// TODO Auto-generated method stub
		this.key = t;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setNext(INode<K> node) {
		// TODO Auto-generated method stub
		this.next = (MapNode<K, V>) node;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public int compareTo(INode<K> node) {
		// TODO Auto-generated method stub
		return this.key.compareTo(node.getKey());
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("My Map Node: K-").append(key).append(" V- ").append(value);
		if (this.next != null)
			str.append("->").append(next);
		return str.toString();

	}

}
