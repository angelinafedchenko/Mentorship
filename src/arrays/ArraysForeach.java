package arrays;

import java.util.Arrays;

public class ArraysForeach {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;

        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "Bye";
        strings[2] = "Java";

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(strings[0]);
        System.out.println(strings[2]);

        System.out.println("=========");

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println("=========");

        for(String string: strings) {
            System.out.println(string);
        }
//        for (тип_данных название_переменной : контейнер){
//            // действия
//        }

        System.out.println("===========");

        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for(int x: numbers1) {
            sum = sum + x;
        }
            System.out.println(sum);

        System.out.println("========");

        int[] array = new int[] {1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("=== the same ===>");

        int [] array1 = {1,2,3,4,5};
        for (int i : array1) {
            System.out.println(i);
        }

        System.out.println("=========");

        int [] array2 = {1,2,3,4,5};
        for (int i = 0; i < array2.length; i++) {
            array2 [i] = array2 [i] * 2;
            System.out.println(array2[i]);
        }
    }
}
