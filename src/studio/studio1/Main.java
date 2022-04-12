package studio.studio1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String radius;
        double numRadius = 0.0;
        while(numRadius<=0) {
            System.out.println("Input a number that is positive: ");
            radius = input.nextLine();
            if(radius.length()>0){
                int successCounter = 0;
                for (int i = 0; i < radius.length(); i++) {
                    if(Character.isDigit(radius.charAt(i)) || radius.charAt(i)=='.'){
                        successCounter+=1;
                    }
                }
                if(successCounter==radius.length()) {
                    numRadius = Double.parseDouble(radius);
                }
            }
        }
        double area = Area.calcArea(numRadius);
        System.out.println("The area of a circle with radius " + numRadius + ", is " + area + ".");
        input.close();
    }
}

