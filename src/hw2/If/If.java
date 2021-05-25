package hw2.If;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        System.out.println("Type 1, 2 or 3");
        Scanner inputNumber = new Scanner(System.in);

        int myInt = inputNumber.nextInt();

        if (myInt == 1) {

            System.out.println("It's 1");

        } else if (myInt == 2){

            System.out.println("It's 2");

        } else if (myInt == 3){

            System.out.println("It's 3");
        } else {

            System.out.println("Try again");
        }

    }
}
