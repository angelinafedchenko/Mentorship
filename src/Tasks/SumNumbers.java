package Tasks;

//Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        System.out.println("Type your number");

        Scanner typeNum = new Scanner(System.in);
        int num = typeNum.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
