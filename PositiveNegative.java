package anu_class_java;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int positiveCount = 0;
        int negativeCount = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;
            }
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
    }
}
