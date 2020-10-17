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
	@Test
	public void allNumbersAddedToTreeReturnSize() {
		BinarySearchTree<Integer> binaryTree = new BinarySearchTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(65);
		binaryTree.add(63);
		binaryTree.add(67);
		binaryTree.add(40);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(11);
		Assert.assertEquals(13, binaryTree.getSize());
	}
	@Test
	public void searchBinaryTree() {
		BinarySearchTree<Integer> binaryTree = new BinarySearchTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(65);
		binaryTree.add(63);
		binaryTree.add(67);
		binaryTree.add(40);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(11);
		Assert.assertTrue(binaryTree.search(63));
	}
	
	
}