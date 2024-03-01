import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Daniel Wedding
 * Assignment 4 Problem 1
 * Get the length from the center to a vertex, convert to area
 * 
 */
public class Assignment4Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double len = input.nextDouble();
        double area = Assignment4Problem1.calculateArea(len);
        System.out.println(String.format(Locale.US, "The area of the pentagon is %.2f", area));
    }

    public static double calculateArea(double len){
        double side = 2 * len * Math.sin(Math.PI/5);
        double area = (5 * side * side)/(4 * Math.tan(Math.PI/5));
        return area;
    }
}
