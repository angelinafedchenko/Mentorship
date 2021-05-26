package hw2.If;

import hw2.While.ScannerWhile;

import java.util.Scanner;

public class Switch_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        switch (age) {

            case 0:
                System.out.println("Your born.");
                break;
            case 7:
                System.out.println("Your are in school.");
                break;
            case 18:
                System.out.println("Your are not in school.");
                break;
            default:
                System.out.println("Nothing from proposed.");
        }






    }
}
