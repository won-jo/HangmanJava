package com.hangman.players;

import com.hangman.Player;

import java.util.List;

public class YourPlayer implements Player {
	
	Character[] chars = {'e', 'a', 'r', 't', 's', 'o', 'n', 'l', 'i', 'c', 'p', 'd', 'u', 'm', 'y', 'f', 'h', 'b', 'g',
						'v', 'w'};
	
	private static int index = 0;
	
    @Override
    public char getGuess(List<Character> currentClue) {
    	
    	return chars[index++];
    }
}
