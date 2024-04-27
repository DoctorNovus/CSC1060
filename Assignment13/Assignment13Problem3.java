import java.util.Scanner;

/**
 * Daniel Wedding
 * CompSci 1060
 * 04/26/24
 * 
 * Assignment 13 Problem 3
 * Linear Equations
 */
public class Assignment13Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        String[] valuesAsStrings = input.nextLine().split(" ");
        double[] values = new double[valuesAsStrings.length];

        for (int i = 0; i < valuesAsStrings.length; i++) {
            values[i] = Double.parseDouble(valuesAsStrings[i]);
        }

        LinearEquations linEqu1 = new LinearEquations(values[0], values[1], values[2], values[3], values[4], values[5]);

        if (linEqu1.isSolvable()) {
            System.out.println(String.format("X Value: %f", linEqu1.getX()));
            System.out.println(String.format("Y Value: %f", linEqu1.getY()));
        } else
            System.out.println("The equation has no solution.");

        input.close();
    }
}

class LinearEquations {
    private double a, b, c, d, e, f;

    LinearEquations(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    boolean isSolvable() {
        return ((a * d) - (b * c)) != 0;
    }

    double getX() {
        return ((e * d) - (b * f)) / ((a * d) - (b * c));
    }

    double getY() {
        return ((a * f) - (e * c)) / ((a * d) - (b * c));
    }
}