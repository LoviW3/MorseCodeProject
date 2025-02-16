import java.util.HashMap;
import java.util.Objects;

public class InputConverter {

    private static final String[] english = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " ", ""
    };
    private static final String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "/", " "
    };

    private static final HashMap<String, String> enToMorse = new HashMap<>();
    private static final HashMap<String, String> morseToEn = new HashMap<>();

    static {
        for (int i = 0; i < english.length; i++) {
            enToMorse.put(english[i], morse[i]);
            morseToEn.put(morse[i], english[i]);
        }
    }
    public String morseTranslation;
    public String englishTranslation;

    public boolean englishToMorse(String input){
        input = input.toLowerCase();
        morseTranslation = "";
        for (int i = 0; i < input.length(); i++){
            if (Objects.equals(enToMorse.get(input.substring(i, i + 1)), null)) {
                return false;
            } else {morseTranslation = morseTranslation + enToMorse.get(input.substring(i, i+1))+ " ";}
        } return true;
    }

    public boolean morseToEnglish(String input) {
        englishTranslation = "";
        String[] words = input.split(" ");
        for (String word : words) {
            if (Objects.equals(morseToEn.get(word),null)) {
                return false;
            } else {englishTranslation = englishTranslation + morseToEn.get(word);}
        } return true;
    }
}


