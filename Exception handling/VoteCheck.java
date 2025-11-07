package anu_class_java;

//Write a program to check if a person is eligible for voting or not.
//A person will be eligible if his age is greater than or equal to 18.
import java.util.*;  // import for Scanner

//Custom Exception class for not eligible case
@SuppressWarnings("serial")
class NotEligibleException extends Exception {
 NotEligibleException(String msg) {
     super(msg);
 }
}

//Main class – contains logic for eligibility check
public class VoteCheck {

 // Method to check age and throw exception if needed
 static void checkAge(int age) throws NotEligibleException {
     if(age < 0)
         throw new NotEligibleException("Age can't be negative!");
     else if(age < 18)
         throw new NotEligibleException("Not eligible for voting!");
     else
         System.out.println("You are eligible for voting.");  // valid case
 }

 public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);  // for input
     try {
         // --- Input block ---
         System.out.print("Enter your age: ");
         int age = sc.nextInt();

         // --- Check eligibility ---
         checkAge(age);
     }
     catch(NotEligibleException e) {   // handles custom exception
         System.out.println(e.getMessage());
     }
     catch(Exception e) {   // handles invalid inputs
         System.out.println("Invalid input!");
     }
     sc.close();  // close scanner
 }
}
