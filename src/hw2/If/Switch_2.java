package hw2.If;

import java.util.Scanner;

public class Switch_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?");
        String age = scanner.nextLine();

        switch (age) {

            case "zero":
                System.out.println("You born.");
                break;
            case "seven":
                System.out.println("Your are in school.");
                break;
            case "eighteen":
                System.out.println("Your are not in school.");
                break;
            default:
                System.out.println("Nothing from proposed.");
        }

    }
}
