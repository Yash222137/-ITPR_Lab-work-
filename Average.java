package anu_class_java;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / 10;
        System.out.println("Average: " + average);
    }
}
