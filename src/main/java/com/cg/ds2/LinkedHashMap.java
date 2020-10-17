package com.cg.ds2;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class LinkedHashMap<K extends Comparable<K>, V> {

	private ArrayList<LinkedList<K>> list;
	private final int indexes;

	public LinkedHashMap() {
		list = new ArrayList<LinkedList<K>>();
		indexes = 11;
		this.createBucket();
	}

	public int getIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % indexes;
		return index;

	}
	public void createBucket() {
		for(int i=0;i<=10;i++)
			list.add(i, null);
	}


	public V get(K key) {
		LinkedList<K> thisList = new LinkedList<K>();
		thisList = list.get(getIndex(key));
		if (thisList == null) {
			return null;
		} else {
			MapNode<K, V> mn = (MapNode<K, V>) thisList.search(key);
			return mn == null ? null : mn.getValue();
		}
	}

	public void add(K key, V value) {
		LinkedList<K> thisList = this.list.get(getIndex(key));
		if (thisList == null) {
			thisList = new LinkedList<K>();
			this.list.set(getIndex(key), thisList);
		}
		MapNode<K, V> mn = (MapNode<K, V>) thisList.search(key);
		if (mn == null) {
			mn = new MapNode<K, V>(key, value);
			this.list.get(getIndex(key)).append(mn);
		} else
			mn.setValue(value);
	}

	public void remove(K key) {
		INode<K> node = this.list.get(getIndex(key)).search(key);
		this.list.get(getIndex(key)).pop(node);

	}

}
