package AxelMonroyX.chapter1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by axel on 4/01/17.
 * github.com/AxelMonroyX
 */
public class Question1_3_RemoveDuplicateString {
    public String removeDuplicates(String stringToRemoveDuplicates) {
        if (stringToRemoveDuplicates == null) {
            throw new RuntimeException("Need a valid String");
        }

        char[] arrayOfCharacters = stringToRemoveDuplicates.toCharArray();
        StringBuilder withoutDuplicates = new StringBuilder();

        Set setOfUniqueCharacters = new TreeSet();
        for (char actualCharacter : arrayOfCharacters) {
            setOfUniqueCharacters.add(actualCharacter);
        }

        for (Object c : setOfUniqueCharacters) {
            withoutDuplicates.append(c);
        }
        return withoutDuplicates.toString();
    }
}
