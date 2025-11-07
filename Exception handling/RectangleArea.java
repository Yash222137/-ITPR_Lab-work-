package anu_class_java;

//Write a program to calculate area and perimeter of the rectangle. Use Custom Exception.
import java.util.*;   // import library for Scanner class

@SuppressWarnings("serial")
// Custom Exception class for invalid input
class  InvalidInputException extends Exception {
    InvalidInputException(String msg) {
        super(msg);
        
    }
}

// Rectangle class – handles area and perimeter logic
class Rectangle {
    double length, width;  // data members

    // Constructor to initialize and validate values
    Rectangle(double l, double w) throws InvalidInputException {
        if(l <= 0 || w <= 0)
            throw new InvalidInputException("Length and width must be positive!");
        length = l;
        width = w;
    }

    // Method to calculate area
    double area() {
        return length * width;
    }

    // Method to calculate perimeter
    double perimeter() {
        return 2 * (length + width);
    }
}

// Main class – program starts here
public class RectangleArea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);   // for taking user input
        try {
            // --- Input block ---
            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter width: ");
            double w = sc.nextDouble();

            // --- Object creation & method calling ---
            Rectangle r = new Rectangle(l, w);
            System.out.println("Area = " + r.area());
            System.out.println("Perimeter = " + r.perimeter());
        }
        catch(InvalidInputException e) {   // handles custom exception
            System.out.println("Error: " + e.getMessage());
        }
        catch(Exception e) {   // handles other unexpected errors
            System.out.println("Invalid input!");
        }
        sc.close();  // close scanner
    }
}
