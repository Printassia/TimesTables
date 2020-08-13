package Horsy.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declaration and Scanner class
        Scanner in = new Scanner(System.in);
        String input = "";

        //Start of Program
        while (!input.equals("quit")) {
            System.out.print("Enter a number: ");
            input = in.next().toLowerCase();
            if (input.equals("quit")) {
                break;
            } else {

                System.out.println("First 20 Multiples of " + input);
                //Convert to Int
                int convertToInt = Integer.parseInt(input);
                //Calculation
                int calculate = convertToInt * convertToInt;
                //For Loop
                for (calculate = 0; calculate <= 20; calculate++) {
                    int answer = convertToInt * calculate;
                    //Output
                    System.out.println(input + " X " + calculate + " = " + answer);
                }
            }
        }
        // Print quit and terminate program
        System.out.println(input);
    }
}
