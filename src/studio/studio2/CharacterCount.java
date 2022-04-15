package studio.studio2;
import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args){
        HashMap<Character, Integer> charMap = new HashMap<>();
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = quote.toCharArray();
        for(char character : charactersInString){
            //check if the character is in the map, and if it isn't then set the value of the key to 1
            //if it is already, then just add 1 to the map
            if(charMap.containsKey(character)){
                int value = charMap.get(character);
                charMap.put(character, value+1);
            } else {
                charMap.put(character, 1);
            }
        }
        charMap.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
}
