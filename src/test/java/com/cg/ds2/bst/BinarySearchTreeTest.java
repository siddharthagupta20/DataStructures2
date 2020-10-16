package com.cg.ds2.bst;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {
	@Test
	public void numbersAddedToTreeReturnSize() {
		BinarySearchTree<Integer> binaryTree = new BinarySearchTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		Assert.assertEquals(3, binaryTree.getSize());
	}
	
	
}