package anu_class_java;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];

        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Even numbers:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}