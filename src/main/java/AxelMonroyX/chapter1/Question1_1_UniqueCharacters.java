package AxelMonroyX.chapter1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by axel on 4/01/17.
 * github.com/AxelMonroyX
 */
public class Question1_1_UniqueCharacters {
    public boolean onlyUniqueCharacters(String characters) {
        if (characters != null && !characters.equals("")) {

            char[] arrayOfCharacters = characters.toCharArray();
            Set setOfUniqueCharacters = new HashSet();
            for (char actualCharacter : arrayOfCharacters) {
                setOfUniqueCharacters.add(actualCharacter);
            }
            return arrayOfCharacters.length == setOfUniqueCharacters.size() ? true : false;
        }
        return false;
    }
}
