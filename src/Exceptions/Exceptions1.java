package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {

    public static void main(String[] args) {

        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("From main");
        }

//        File file = new File("qqq");
//
//        try {
//            Scanner scanner = new Scanner(file);
//
//        } catch (FileNotFoundException e) {
//            System.out.println("File is not found");
//        }
//
//        System.out.println("After exception");
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("dsdsds");
        Scanner scanner = new Scanner(file);
    }
}
