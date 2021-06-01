package Exceptions2;

import hw1.Task7.A;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ErrorExample {

    private ABC abc = new ABC();

    public void foo() {
        //System.out.println(1/0);
//        int array[] = {1,2,3};
//        array[5] = 3;
//        try {
//            abc.show();
//        } catch (NullPointerException e) { // = (Exception e)
//            System.err.println("Division by 0");
//        }


//        ==>
//        if (abc == null) {
//            System.out.println("Null pointer");
//        } else {
//            abc.show();
//        }


        try {
            abc.show(); //(private ABC abc;)
            System.out.println(1/0);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }
        // == NullPointerException|ArithmeticException e


    }

    public void foo2() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("");
    }

}

