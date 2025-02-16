import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestCases {

    @Test
    public void enToMorseCorrect(){
        InputConverter ic = new InputConverter();
        String english = "hello world";
        Boolean input = ic.englishToMorse(english);
        String actual = ic.morseTranslation;
        String expected = ".... . .-.. .-.. --- / .-- --- .-. .-.. -.. ";
        assertEquals(expected,actual);
    }

    @Test
    public void enToMorseBig() {
        InputConverter ic = new InputConverter();
        String english = "HELLO WORLD";
        boolean input = ic.englishToMorse(english);
        String actual = ic.morseTranslation;
        String expected = ".... . .-.. .-.. --- / .-- --- .-. .-.. -.. ";
        assertEquals(expected,actual);
    }

    @Test
    public void enToMorseIncorrect(){
        InputConverter ic = new InputConverter();
        String english = "1 2 3 testing";
        boolean input = ic.englishToMorse(english);
        String actual = ic.morseTranslation;
        String expected = "" ;
        assertEquals(expected,actual);
    }

    @Test
    public void morseToEnCorrect(){
        InputConverter ic = new InputConverter();
        String morse = ".... . .-.. .-.. --- / .-- --- .-. .-.. -.. ";
        boolean input = ic.morseToEnglish(morse);
        String actual = ic.englishTranslation;
        String expected = "hello world";
        assertEquals(expected,actual);

    }

    @Test
    public void morseToEnIncorrect(){
        InputConverter ic = new InputConverter();
        String morse = "..... .-.. .-.. --- / .-- --- .-. .-.. -.. ";
        boolean input = ic.morseToEnglish(morse);
        String actual = ic.englishTranslation;
        String expected = "";
        assertEquals(expected,actual);
    }
}