package Exceptions1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintStringException {
    public static void main(String[] args) {

        printFirstString("dfsdfs");

    }

    public static void printFirstString (String filePath) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error input/output!");
            e.printStackTrace();
        }
    }

}
