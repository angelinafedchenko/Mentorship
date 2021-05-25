package hw2.If;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Type 1");

        Scanner typeNumber = new Scanner(System.in);

        int number = typeNumber.nextInt();

        if (number == 1) {
            System.out.println("Good job! It's 1");
        } else {
            System.out.println("Try again");
        }
    }
}
