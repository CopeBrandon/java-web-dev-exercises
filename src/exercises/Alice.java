package exercises;
import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String alice = "alice " + "was " + "beginning " + "to " + "get " + "very " + "tired " + "of " + "sitting " + "by " + "her " + "sister " + "on " + "the " + "bank " + "and " + "of " + "having " + "nothing " + "to " + "do" +": " + "once " + "or " + "twice " + "she " + "had " + "peeped " + "into " + "the " + "book " + "her " + "sister " + "was " + "reading" + ", "+ "but " + "it " + "had " + "no " + "pictures " + "or " + "conversations " + "in " + "it" + ", '" + "and " + "what " + "is " + "the " + "use " + "of " + "a " + "book" + ",' " + "thought " + "alice " + "'" + "without " + "pictures " + "or " + "conversation" + "?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Input word to search for: ");
        String word = input.next();
        word = word.toLowerCase();
        boolean contains = alice.contains(word);
        System.out.println("Contains word: " + contains);
        if(contains){
            int index = alice.indexOf(word);
            String newAlice = alice.replace(word, "");
            System.out.println("Index of word: " + index);
            System.out.println(newAlice);
        }
    }
}


