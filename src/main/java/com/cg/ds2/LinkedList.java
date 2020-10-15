package com.cg.ds2;

public class LinkedList<K> {
	private INode<K> head;
	private INode<K> tail;
	private int length;

	public LinkedList() {
		this.head = null;
		this.tail = null;
		length = 0;
	}

	public INode<K> getHead() {
		return head;
	}

	public INode<K> getTail() {
		return tail;
	}

	public void add(INode<K> node) {
		length++;
		if (this.head == null) {
			this.head = node;
			this.tail = node;
		} else {
			node.setNext(this.head);
			this.head = node;
		}

	}

	public void append(INode<K> node) {
		length++;
		if (this.head == null) {
			this.head = node;
			this.tail = node;
		} else {

			this.tail.setNext(node);
			this.tail = node;
		}
	}

	public void insert(INode<K> node, int pos) {
		if (pos > 0 && pos <= length) {
			int count = 0;
			INode<K> currentNode = this.head;
			while (currentNode!=null) {
				count++;
				if (count == pos) {
					node.setNext(currentNode.getNext());
					currentNode.setNext(node);
					break;
				}
				currentNode = currentNode.getNext();
			}
			length++;
		} else
			System.out.println("No such position.");

	}

	public void popFirst() {
		this.head = this.head.getNext();
		length--;
	}

	public void popLast() {
		INode<K> currentNode = this.head;
		int count = 0;
		while (currentNode!=null) {
			count++;
			if (count == (length - 1)) {
				currentNode.setNext(null);
				this.tail = currentNode;
				break;
			}
			currentNode = currentNode.getNext();
		}
		length--;

	}

	public int size() {
		return this.length;
	}

	public INode<K> search(K key) {
		INode<K> tempNode = head;
		while (tempNode != null) {
			if (tempNode.getKey().equals(key)) {
				System.out.println("Element found!!");
				return tempNode;
			} else
				tempNode = tempNode.getNext();
		}
		return null;
	}

	public String print() {
		return "My Linked List: [ " + head + " ]";
	}

}
