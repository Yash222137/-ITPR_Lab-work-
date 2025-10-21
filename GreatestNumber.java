package anu_class_java;

//Q1. Write a program to find out greatest number by using method
//Date: 14 Oct
//Time: 10 minutes

import java.util.Scanner;

public class GreatestNumber {
 
 // Method to find the greatest number
 static int findGreatest(int a, int b, int c) {
     if (a >= b && a >= c)
         return a; // a is greatest
     else if (b >= a && b >= c)
         return b; // b is greatest
     else
         return c; // c is greatest
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Taking three numbers from user
     System.out.print("Enter first number: ");
     int num1 = sc.nextInt();
     System.out.print("Enter second number: ");
     int num2 = sc.nextInt();
     System.out.print("Enter third number: ");
     int num3 = sc.nextInt();

     // Calling method
     int greatest = findGreatest(num1, num2, num3);

     // Displaying result
     System.out.println("The greatest number is: " + greatest);
 }
}
