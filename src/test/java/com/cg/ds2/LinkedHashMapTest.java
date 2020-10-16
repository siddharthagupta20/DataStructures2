package com.cg.ds2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedHashMapTest {
	
	@Test
	public void givenStatement_givesFrequency() {
		String statement="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] str= statement.split(" ");
		LinkedHashMap<String, Integer> words=new LinkedHashMap<String, Integer>();
		for(String word:str) {
			if(words.get(word)==null) {
				words.add(word, 1);
			}
			else
				words.add(word, words.get(word)+1);
		}
		assertEquals((Integer)3,words.get("paranoid"));
	}

}
