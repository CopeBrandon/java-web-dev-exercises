package exercises.ch3;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercises3_7_ArrayList {
    public static void ArrayPractice(){
        int[] arr = {1, 1, 2, 3, 5, 8};
        String drSeuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] drSeussArray = drSeuss.split("\\.");
        for(int num : arr){
            if(num%2!=0) {
                System.out.println(num);
            }
        }
        System.out.println(Arrays.toString(drSeussArray));
    }
    public static Integer ArrayListEven(ArrayList<Integer> arrayList){
        int sum = 0;
        for (int num : arrayList) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
    public static void ArrayListNumPrint(ArrayList<String> strings, int num){
        for (String string : strings) {
            if (string.length() == num) {
                System.out.println(string);
            }
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayPractice();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] strArray = {"Hey", "Words", "Thing", "Rutabaga", "Calculator", ""};
        ArrayList<String> stringArrayList = new ArrayList<>();
        Collections.addAll(stringArrayList, strArray);
        Collections.addAll(arrayList, intArray);
        System.out.println(ArrayListEven(arrayList));
        System.out.println("Enter length of words: ");
        int num = input.nextInt();
        ArrayListNumPrint(stringArrayList, num);
    }
}
