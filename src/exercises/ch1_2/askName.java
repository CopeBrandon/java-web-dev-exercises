package exercises.ch1_2;
import java.util.Scanner;

public class askName {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
