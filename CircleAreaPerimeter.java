package anu_class_java;

//Program to calculate area and perimeter of a circle using float values, constructor, and methods

// Date: 17 Oct
//Time: 10 minutes


import java.util.Scanner;

class Circle {
 float radius;  // data member to store radius

 // Constructor to initialize radius
 Circle(float r) {
     radius = r;
 }

 // Method to calculate area of circle
 float calculateArea() {
     return 3.14f * radius * radius;  // 'f' added to use float value
 }

 // Method to calculate perimeter (circumference) of circle
 float calculatePerimeter() {
     return 2 * 3.14f * radius;
 }
}

public class CircleAreaPerimeter {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Taking radius input from user
     System.out.print("Enter radius of circle: ");
     float r = sc.nextFloat();

     // Creating object of Circle class and passing radius to constructor
     Circle c = new Circle(r);

     // Displaying area and perimeter using methods
     System.out.println("Area of Circle = " + c.calculateArea());
     System.out.println("Perimeter of Circle = " + c.calculatePerimeter());

     sc.close();  // closing scanner
 }
}
 