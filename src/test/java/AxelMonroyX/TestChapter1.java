package AxelMonroyX;

/**
 * Created by axel on 4/01/17.
 * github.com/AxelMonroyX
 */

import AxelMonroyX.chapter1.Question1_1_UniqueCharacters;
import AxelMonroyX.chapter1.Question1_2_Reverse;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestChapter1 {

    @Test
    public void Question_1_1() throws Exception {
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

    @Test
    public void Question_1_2() throws Exception {
        Question1_2_Reverse q_reverse = new Question1_2_Reverse();
        assertEquals("eveileb ot gnihtemos", q_reverse.reverse("something to believe"));
        assertEquals(" eveileb ot gnihtemos", q_reverse.reverse("something to believe "));
        assertEquals("eveileb ot gnihtemos ", q_reverse.reverse(" something to believe"));
        assertEquals(" eveileb ot gnihtemos ", q_reverse.reverse(" something to believe "));
        assertEquals(" ", q_reverse.reverse(" "));

        assertEquals(String.valueOf(new RuntimeException("Need a valid String to reverse")), q_reverse.reverse(null));
    }
}
