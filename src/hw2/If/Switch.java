package hw2.If;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Type 1, 2, 3 or 4");

        Scanner switchCase = new Scanner(System.in);
        int number = switchCase.nextInt();

        switch (number) {
            case 1:
                System.out.println("It's 1"); break;
            case 2:
                System.out.println("It's 2"); break;
            case 3:
                System.out.println("It's 3"); break;
            case 4:
                System.out.println("It's 4"); break;
            default:
                System.out.println("Try again");
        }
    }
}
