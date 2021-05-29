package Exceptions1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Username\\Desktop\\test.txt"));
            String firstString = reader.readLine();
            System.out.println(firstString);

        } catch (FileNotFoundException e) {

            System.out.println("Error! File is not found");
        }

        System.out.println("================");

        try {
            int[] numbers = {1, 2, 3, 4};
            System.out.print(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of array");
        }

        System.out.println("================");

        try {
            System.out.println("Divide the number by zero");
            System.out.println(123/0);

            System.out.println("This operation");
            System.out.println("won't");
            System.out.println("be");
            System.out.println("performed");
        } catch (ArithmeticException e) {
            System.out.println("It's block catch");
            System.out.println("You can't divide the number by zero");
        }

        System.out.println("================");

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Username\\Desktop\\test.txt"));
            System.out.println(123/0); //1
            String firstString = reader.readLine(); //2
            System.out.println(firstString);

        } catch (FileNotFoundException e) { //1
            System.out.println("Error! File is not found");

        } catch (ArithmeticException e) { //2
            System.out.println("You can't divide the number by zero");
        }


    }
}


