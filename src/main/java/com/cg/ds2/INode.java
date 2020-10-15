package com.cg.ds2;

public interface INode<K> {

	public void setKey(K t);

	public K getKey();

	public void setNext(INode<K> node);

	public INode<K> getNext();

	int compareTo(INode<K> node);

}
