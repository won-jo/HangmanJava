package com.hangman;

import java.util.HashMap;
import java.util.Map;

public class LetterCountApp {

	public static void main(String[] args) {
		Map<String, Integer> letter = new HashMap<String, Integer>();
		for(String word : WordList.words) {
			for(Character c : word.toCharArray()) {
				Integer counter = letter.get(c.toString());
				if(counter == null)
					letter.put(c.toString(), 1);
				else
					letter.put(c.toString(), ++counter);
				
			}
		}
		
		int max = 0;
		String l = "";
		
		for(String key : letter.keySet()) {
			System.out.println(key + " : " + letter.get(key));
			int counter = letter.get(key);
			if(counter > max) {
				l = key;
			}
		}

	}

}
