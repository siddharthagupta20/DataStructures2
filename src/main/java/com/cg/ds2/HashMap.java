package com.cg.ds2;

@SuppressWarnings("unchecked")
public class HashMap<K extends Comparable<K>, V> {

	private LinkedList<K> list;

	public HashMap() {
		this.list = new LinkedList<K>();
	}

	public void add(K key, V value) {
		MapNode<K, V> mn = (MapNode<K, V>) this.list.search(key);
		if (mn == null) {
			mn = new MapNode<K, V>(key, value);
			this.list.append(mn);
		} else
			mn.setValue(value);
	}

	public V get(K key) {
		return this.list.search(key) == null ? null : ((MapNode<K, V>) this.list.search(key)).getValue();
	}

	public String printMap() {
		return "My Hash Map: " + this.list.print();
	}

}
