package AxelMonroyX;

/**
 * Created by axel on 4/01/17.
 * github.com/AxelMonroyX
 */

import AxelMonroyX.chapter1.Question1_1_UniqueCharacters;
import AxelMonroyX.chapter1.Question1_2_Reverse;
import AxelMonroyX.chapter1.Question1_3_RemoveDuplicateString;
import AxelMonroyX.chapter1.Question_1_4_AnagramAnalyzer;
import org.junit.Test;

import static junit.framework.TestCase.*;


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
        try {
            q_reverse.reverse(null);
        } catch (Exception e) {
            assertEquals(String.valueOf(new RuntimeException("Need a valid String to reverse")), String.valueOf(e));
        }
    }

    @Test
    public void Question_1_3() throws Exception {
        Question1_3_RemoveDuplicateString q_removeDuplicates = new Question1_3_RemoveDuplicateString();
        assertEquals(" d", q_removeDuplicates.removeDuplicates(" d"));
        assertEquals(" d", q_removeDuplicates.removeDuplicates(" d "));
        assertEquals("as", q_removeDuplicates.removeDuplicates("assaa"));
        assertEquals("a", q_removeDuplicates.removeDuplicates("a"));
        assertEquals("", q_removeDuplicates.removeDuplicates(""));

        try {
            q_removeDuplicates.removeDuplicates(null);
        } catch (Exception e) {
            assertEquals(String.valueOf(new RuntimeException("Need a valid String")), String.valueOf(e));
        }

    }

    @Test
    public void Question_1_4() throws Exception {
        Question_1_4_AnagramAnalyzer anagramAnalyzer = new Question_1_4_AnagramAnalyzer();
        assertTrue(anagramAnalyzer.isAnAnagram("", ""));
        assertTrue(anagramAnalyzer.isAnAnagram(" ", " "));
        assertTrue(anagramAnalyzer.isAnAnagram("has", "ash"));
        assertTrue(anagramAnalyzer.isAnAnagram("nearer", "earner"));
        assertTrue(anagramAnalyzer.isAnAnagram("cheaters", "hectares"));
        assertTrue(anagramAnalyzer.isAnAnagram(new String[]{"cheaters", "hectares", "teachers"}));
        assertTrue(anagramAnalyzer.isAnAnagram(new String[]{"cheaters", "hectares"}));
        assertFalse(anagramAnalyzer.isAnAnagram(new String[]{"cheaterss", "hectares", "teachers"}));
        assertFalse(anagramAnalyzer.isAnAnagram("nearer", "earner1"));

        String ExpectedException = String.valueOf(new RuntimeException("Need at least 2 valid words"));
        try {
            anagramAnalyzer.isAnAnagram(new String[]{"cheaters"});
        } catch (Exception e) {
            assertEquals(ExpectedException, String.valueOf(e));
        }
        try {
            anagramAnalyzer.isAnAnagram(null);
        } catch (Exception e) {
            assertEquals(ExpectedException, String.valueOf(e));
        }
        try {
            anagramAnalyzer.isAnAnagram(null, null);
        } catch (Exception e) {
            assertEquals(ExpectedException, String.valueOf(e));
        }
        try {
            anagramAnalyzer.isAnAnagram(null, null);
        } catch (Exception e) {
            assertEquals(ExpectedException, String.valueOf(e));
        }
        try {
            anagramAnalyzer.isAnAnagram(new String[]{});
        } catch (Exception e) {
            assertEquals(ExpectedException, String.valueOf(e));
        }
        try {
            anagramAnalyzer.isAnAnagram(new String[]{null,null});
        } catch (Exception e) {
            assertEquals(ExpectedException, String.valueOf(e));
        }
        try {
            anagramAnalyzer.isAnAnagram(new String[]{"s",null});
        } catch (Exception e) {
            assertEquals(ExpectedException, String.valueOf(e));
        }


    }
}
