package AxelMonroyX.chapter1;

/**
 * Created by axel on 11/01/17.
 * github.com/AxelMonroyX
 */
public class Question1_5_ReplaceWhitespaces {

    public String replace_whitespaces_url_encoding_style(String textToEncode) {
        if (textToEncode==null) return "";

        return textToEncode.replace(" ", "%20");
    }
}
