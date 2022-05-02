package exercises.ch7;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        EntityCounter counter = new EntityCounter();
        Scanner input = new Scanner(System.in);

        for(int i=0;i<100;i++){

        }

        Laptop laptop = new Laptop(1, 4, 8, counter.createID());
        System.out.println("Input length of calculation: ");
        double calcs = input.nextDouble();
        while(true) {
            System.out.println("Do you want to open a tab? y for yes: ");
            String text = input.next();
            if(text.equals("y")){
                laptop.openTab();
                System.out.println("Current tabs open: " + laptop.getMemory());
            } else {
                break;
            }
        }
        laptop.runUnplugged(calcs);


        SmartPhone smartPhone = new SmartPhone(1, 2, 4, counter.createID());
        System.out.println("SmartPhone os: " + smartPhone.getOs());
        System.out.println("Laptop os: " + laptop.getOs());
        System.out.println("SmartPhone id: " + smartPhone.getid());
        System.out.println("Laptop id: " + laptop.getid());
    }
}
