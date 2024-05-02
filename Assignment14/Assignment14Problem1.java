import java.util.Scanner;

class LinearEquation {
    private double a, b, c, d, e, f;

    LinearEquation(double a, double b, double c, double d, double e, double f) {
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

/**
 * Daniel Wedding
 * CompSci 1060
 * 04/29/24
 * 
 * Assignment 14 (Extra Credit) Problem 1
 * Intersecting Points
 */
public class Assignment14Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first segment (x1 y1 x2 y2): ");
        String[] segment1 = input.nextLine().split(" ");
        double x1 = Double.parseDouble(segment1[0]);
        double y1 = Double.parseDouble(segment1[1]);
        double x2 = Double.parseDouble(segment1[2]);
        double y2 = Double.parseDouble(segment1[3]);

        System.out.print("Enter the second segment (x3 y3 x4 y4): ");
        String[] segment2 = input.nextLine().split(" ");
        double x3 = Double.parseDouble(segment2[0]);
        double y3 = Double.parseDouble(segment2[1]);
        double x4 = Double.parseDouble(segment2[2]);
        double y4 = Double.parseDouble(segment2[3]);

        double a = y1 - y2;
        double b = -1 * (x1 - x2);
        double c = y3 - y4;
        double d = -1 * (x3 - x4);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        LinearEquation linEqu = new LinearEquation(a, b, c, d, e, f);

        if (linEqu.isSolvable())
            System.out.print(String.format("The intersecting point is (%f, %f)", linEqu.getX(), linEqu.getY()));
        else
            System.out.print("The lines are parallel, therefore do not intersect.");

        input.close();
    }
}