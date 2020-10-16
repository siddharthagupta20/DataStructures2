package com.cg.ds2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HashMapTest {

	@Test
	public void givenString_GivesFrequency() {
		String sentence = "To be or not to be";
		String[] words = sentence.toLowerCase().split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String str : words) {
			if (hm.get(str) == null)
				hm.add(str, 1);
			else
				hm.add(str, hm.get(str) + 1);
		}
		System.out.println(hm.printMap());
		assertEquals((Integer)2, hm.get("to"));
	}

}
