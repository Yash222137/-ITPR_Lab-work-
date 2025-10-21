package anu_class_java;
// date- 6th oct
// time 10 minutes
//Java program to input marks of 5 subjects and calculate total, percentage and grade
import java.util.Scanner;

public class MarksGrade {
 public static void main(String[] args) {
     // Create Scanner object for taking input
     Scanner sc = new Scanner(System.in);
     
     // Declare array to store marks of 5 subjects
     int marks[] = new int[5];
     int total = 0;        // Variable to store total marks
     double percentage;    // Variable to store percentage
     String grade;         // Variable to store grade
     
     // Input marks of 5 subjects
     System.out.println("Enter marks of 5 subjects (out of 100):");
     for (int i = 0; i < 5; i++) {
         System.out.print("Subject " + (i + 1) + ": ");
         marks[i] = sc.nextInt();   // Read marks
         total += marks[i];         // Add marks to total
     }
     
     // Calculate percentage
     percentage = total / 5.0;
     
     // Determine grade according to percentage
     if (percentage >= 75) {
         grade = "A+";
     } 
     else if (percentage >= 65) {
         grade = "A";
     } 
     else if (percentage >= 55) {
         grade = "B";
     } 
     else if (percentage >= 45) {
         grade = "C";
     } 
     else {
         grade = "Fail";
     }
     
     // Display total marks, percentage, and grade
     System.out.println("\nTotal Marks = " + total);
     System.out.println("Percentage = " + percentage + "%");
     System.out.println("Grade = " + grade);
     
     // Close the scanner
     sc.close();
 }
}