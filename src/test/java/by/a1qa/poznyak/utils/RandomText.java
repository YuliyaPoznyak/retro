package by.a1qa.poznyak.utils;

public class RandomText {
    private static int randomNumber1;
    private static int randomNumber2;
    private static int randomNumber3;
    private static final String UPPER_ALPHABET = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private static final String ALPHABET = "mn bv cxz lkj hgf dsa poi uyt re wq";
    private static String TextToInput;
    private static String textToInput2;

    public static String getRandomText() {
        randomNumber2 = (int) (1+Math.random() * 30);
        TextToInput = "";
        for (int i=0; i<randomNumber2; i++){
            randomNumber1 =(int) (Math.random() * ALPHABET.length());
            TextToInput += ALPHABET.charAt(randomNumber1);
        }
        return TextToInput;
    }
    public static String getRandomText2() {
        randomNumber3 = (int) (1+ (Math.random() * 30));
        textToInput2 = "";
        for (int i=0; i<randomNumber3; i++){
            randomNumber1 =(int) (Math.random() * ALPHABET.length());
            textToInput2 += ALPHABET.charAt(randomNumber1);
        }
        return textToInput2;
    }

}
