import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseTranslator {

    //additional ideas convert morse to alphabet and alphabet to morse and vice versa
    //use .isAlphabetic to check if its a character and if not ignore it
    /*
    Morse Code
      *-> dots
      - -> dash
      "A" -> "*-"
      Map - key, value pairs
     */
    private Map<Character,String > morseMap = new HashMap<>(); //this property belongs to an object

    public static void main(String[] args) { //this keyword static means it belongs to the class
        MorseTranslator morseTranslator = new MorseTranslator(); //new instantiation, MorseTranslator()
        //calls the constructor
        morseTranslator.makeMap(); //load the map with the key value pairs

        Scanner scan = new Scanner(System.in);  //so we can get the user input
        System.out.print("Enter a phrase and I will convert to morse code for you: ");
        String phrase = scan.nextLine();
        String convertedPhrase = convertToMorse(phrase,morseTranslator);
        System.out.println(convertedPhrase);
    }

    public static String convertToMorse(String phrase, MorseTranslator morseTranslator){
        //create a variable to hold the answer
        String answer= "";
        //loop through the phrase
        phrase = phrase.toUpperCase();
        for (int i = 0; i < phrase.length() ; i++) {
            char phraseChar = phrase.charAt(i);
            // convert each character
            // morseTranslator is the object to get to the property called morseMap
            // call the get method to return the value associated with the key
            String morseString = morseTranslator.morseMap.get(phraseChar);
            answer+= morseString + " "; //put a string in between each character
        }
        return answer;
        //deal with spaces?
        //add converted to answer
        //return the answer
    }

    public void makeMap(){ //this method belongs to an object
        morseMap.put('A', "*-");
        morseMap.put('B', "-***");
        morseMap.put('C', "-*-*");
        morseMap.put('D', "-**");
        morseMap.put('E', "*");
        morseMap.put('F', "**-*");
        morseMap.put('G', "--*");
        morseMap.put('H', "****");
        morseMap.put('I', "**");
        morseMap.put('J', "*---");
        morseMap.put('K', "-*-");
        morseMap.put('L', "*-**");
        morseMap.put('M', "--");
        morseMap.put('N', "-*");
        morseMap.put('O', "---");
        morseMap.put('P', "*--*");
        morseMap.put('Q', "--*-");
        morseMap.put('R', "*-*");
        morseMap.put('S', "***");
        morseMap.put('T', "-");
        morseMap.put('U', "**-");
        morseMap.put('V', "***-");
        morseMap.put('W', "*--");
        morseMap.put('X', "-**-");
        morseMap.put('Y', "_*__");
        morseMap.put('Z', "--**");
        morseMap.put(' ',"   ");
    }
}
