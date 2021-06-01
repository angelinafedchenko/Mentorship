package Exceptions2;

import java.io.FileNotFoundException;

public class Main {

    //Throwable Ctrl + H

    public static void main(String[] args) {
        ErrorExample errorExample = new ErrorExample();
        errorExample.foo();

        ErrorExample errorExample2 = new ErrorExample();
        try {
            errorExample2.foo2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
