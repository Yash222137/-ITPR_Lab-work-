package anu_class_java;
//date-6th oct
//time 10 minutes
//Java program to find out whether a number is positive, negative, or zero
import java.util.Scanner;

public class NumberCheck {
 public static void main(String[] args) {
     // Create Scanner object to take input from user
     Scanner sc = new Scanner(System.in);
     
     // Ask user to enter a number
     System.out.print("Enter a number: ");
     int num = sc.nextInt();
     
     // Check whether number is positive, negative, or zero
     if (num > 0) {
         System.out.println("The number is Positive.");
     } 
     else if (num < 0) {
         System.out.println("The number is Negative.");
     } 
     else {
         System.out.println("The number is Zero.");
     }
     
     // Close the scanner
     sc.close();
 }
}