package exercises.ch1_2;
import java.util.Scanner;

public class CalcAreaTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the width of the rectangle as an integer value: ");
        int width = input.nextInt();
        System.out.println("Input the height of the rectangle as an integer value: ");
        int height = input.nextInt();
        int area = width * height;
        System.out.println("Rectangle's area: " + area);
    }
}
