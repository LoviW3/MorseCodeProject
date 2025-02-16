import java.util.Scanner;

public class InputReciver {
    public static void main(String[] args) {
    InputConverter ic = new InputConverter();
        Scanner scan = new Scanner(System.in);
        String englishInput;
        String morseInput;


        System.out.println("Hello! What do you wanna convert?");
        System.out.println("1: Text to morse code");
        System.out.println("2: Morse code to text");
        System.out.println("3. Nothing else, Quit");
        int choice;

        do{
            choice = scan.nextInt();
            scan.nextLine(); //extra read line since nextInt doesn't take into account pressing return
            switch (choice){
                case 1:
                    System.out.println("Please enter the text you want translated into morse code!");
                    englishInput = scan.nextLine();
                    if(ic.englishToMorse(englishInput)){
                        System.out.println("This is what the morse code is in english:\n" + ic.morseTranslation);
                    } else System.out.println("Sorry, this translator can only convert the english alphabet");
                    break;

                case 2:
                    System.out.println("Please enter the morse code you want translated to text!" +
                            "\n Make sure to add a blank space between each combination of . and - for a correct translation." +
                            "\n Like this: -.-- . ... ");
                    morseInput = scan.nextLine();
                    if(ic.morseToEnglish(morseInput)){
                        System.out.println("This is what this morse code translates to in english:\n" + ic.englishTranslation);
                    } else System.out.println("Sorry your input was incorrect. This converter only translates . and -" +
                            "\nMake sure you have put a blank space between each group of morse inputs");
                    break;
            }

        } while(choice != 3);

    }
}
