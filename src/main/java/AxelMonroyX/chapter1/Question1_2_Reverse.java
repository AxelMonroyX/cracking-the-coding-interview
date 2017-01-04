package AxelMonroyX.chapter1;

/**
 * Created by axel on 4/01/17.
 * github.com/AxelMonroyX
 */
public class Question1_2_Reverse {
    public String reverse(String stringToReverse) {
        if (stringToReverse == null) {
            return String.valueOf(new RuntimeException("Need a valid String to reverse"));
        }
        return new StringBuilder(stringToReverse).reverse().toString();
    }
}
