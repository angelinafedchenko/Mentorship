package hw2.While;

import java.util.Scanner;

public class ScannerWhile {
    public static void main(String[] args) {
        System.out.println("Type 1");

        Scanner type1 = new Scanner(System.in);

        int num = type1.nextInt();

        while (num != 1) {
            System.out.println("Try again");
            num = type1.nextInt();

        } if (num == 1) {
            System.out.println("Good job! It's 1");
        }
    }
}
