package com.hangman.players;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class YourPlayerTest {
    @Test
    public void guessesAWhenThereAreNoSuccessfulCharactersGuessedYet() {
        YourPlayer player = new YourPlayer();

        char guess = player.getGuess(Arrays.asList(null, null, null));

        assertEquals('a', guess);
    }

    @Test
    public void guessesEWhenThereAreSuccessfulCharactersGuessedThatAreNotA() {
        YourPlayer player = new YourPlayer();

        char guess = player.getGuess(Arrays.asList('m', null, 'n'));

        assertEquals('e', guess);
    }

    @Test
    public void guessesEWhenAIsThereAreAsInTheClueAsWell() {
        YourPlayer player = new YourPlayer();

        char guess = player.getGuess(Arrays.asList(null, 'a', null));

        assertEquals('e', guess);
    }
}
