package Exceptions1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderException {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Username\\Desktop\\test.txt"));

            String firstString = reader.readLine();
            System.out.println(firstString);

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
            e.printStackTrace();

        } finally {
            System.out.println("It's block finally!");
            if (reader != null) {
                reader.close();
            }
        }
    }
}
