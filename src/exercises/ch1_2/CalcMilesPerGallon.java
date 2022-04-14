package exercises.ch1_2;
import java.util.Scanner;

public class CalcMilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of miles you have driven as an integer value: ");
        int miles = input.nextInt();
        System.out.println("Input the amount of gas you have consumed as an integer value: ");
        int gallons = input.nextInt();
        int mpg = miles / gallons;
        System.out.println("Miles per gallon: " + mpg);
    }

}
