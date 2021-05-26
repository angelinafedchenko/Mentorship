package arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[5]; // numbers --> [array] ссылочный тип
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("======");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }

        System.out.println("======");

        int[] numbers1 = {1, 2, 3};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }

        System.out.println("======");

        int[] nums = {1,2,3,4}; // == int [] nums = new int [] {1,2,3,4};
//        int length = nums.length;
//        int last = nums[nums.length-1];
        System.out.println("Array's length: " + nums.length);
        System.out.println("Last number: " + nums[nums.length-1]);
        System.out.println("First number: " + nums[nums.length-4]);


        System.out.println("======");




    }
}

