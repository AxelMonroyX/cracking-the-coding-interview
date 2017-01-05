package AxelMonroyX.chapter1;

import java.util.Arrays;

/**
 * Created by axel on 5/01/17.
 * github.com/AxelMonroyX
 */
public class Question_1_4_AnagramAnalyzer {
    public boolean isAnAnagram(String[] words) {
        boolean isAnagram = true;
        if (words == null || words.length <= 1 || words[0] == null) {
            throwError_AtLeast2ValidWords();
        } else {
            String sortedString = sortCharacters(words[0]);
            for (int i = 1; i < words.length; i++) {
                if (words[i] == null) throwError_AtLeast2ValidWords();
                if (!sortedString.equals(sortCharacters(words[i]))) {
                    isAnagram = false;
                }
            }
        }
        return isAnagram;
    }

    private void throwError_AtLeast2ValidWords() {
        throw new RuntimeException("Need at least 2 valid words");
    }

    private String sortCharacters(String stringToSort) {
        char[] wordToCompare = stringToSort.toCharArray();
        Arrays.sort(wordToCompare);
        return new String(wordToCompare);
    }

    public boolean isAnAnagram(String word1, String word2) {
        if (word1 == null | word2 == null) throwError_AtLeast2ValidWords();
        if (word1.equals(word2)) return true;
        return isAnAnagram(new String[]{word1, word2});
    }

}
