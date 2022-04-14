package exercises.ch3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercises3_7_HashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        String addStudent;
        do {

            System.out.println("Input student name, or press enter to stop inputting names: ");
            addStudent = input.nextLine();
            if(!addStudent.equals("")) {
                System.out.println("Input student ID: ");
                int id = input.nextInt();
                students.put(id, addStudent);
                input.nextLine();
            }
        } while (!addStudent.equals(""));
        System.out.println("\nClass roster:");
        for(Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }


}
