package AxelMonroyX;

/**
 * Created by axel on 4/01/17.
 * github.com/AxelMonroyX
 */

import AxelMonroyX.chapter1.Question1_1_UniqueCharacters;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestChapter1 {

    @Test
    public void Question_1_1() {
        /**
         * Determine if a string has all unique characters.
         */
        Question1_1_UniqueCharacters unique_characters = new Question1_1_UniqueCharacters();

        assertFalse(unique_characters.onlyUniqueCharacters(null));
        assertFalse(unique_characters.onlyUniqueCharacters(""));
        assertTrue(unique_characters.onlyUniqueCharacters(" "));


        assertTrue(unique_characters.onlyUniqueCharacters("abcde"));
        assertTrue(unique_characters.onlyUniqueCharacters("az3"));
        assertFalse(unique_characters.onlyUniqueCharacters("queen"));
        assertFalse(unique_characters.onlyUniqueCharacters("AvAs"));


    }
}
