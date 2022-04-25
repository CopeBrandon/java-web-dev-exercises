package studio.studio2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCount1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        File file = new File("src/studio/studio2/somedoc.txt");
        Scanner fileRead = new Scanner(file);
        System.out.println("Type in a string to test the number of characters: ");
        String string = fileRead.nextLine();//input.nextLine();//"If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        string = string.replaceAll("[^a-zA-z]", "");
        string = string.toLowerCase();
        System.out.println(string);
        char[] charactersInString = string.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        for(Character character : charactersInString){
            if(charMap.containsKey(character)) {
                int value = charMap.get(character);
                charMap.put(character, ++value);
            } else {
                charMap.put(character, 1);
            }
        }
        charMap.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

    }
}