import java.util.Scanner;

/**
 * Daniel Wedding
 * Assignment 4 Problem 2
 * Calculate the Great Circle Distance
 */
public class Assignment4Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Gets Point 1
        System.out.print("Enter point 1 (latitutude and lognitude) in degrees: ");
        String point1 = input.nextLine();
        String[] point1Items = point1.split(" ");
        double x1 = Double.parseDouble(point1Items[0]);
        double y1 = Double.parseDouble(point1Items[1]);

        // Gets Point 2
        System.out.print("Enter point 2 (latitutude and lognitude) in degrees: ");
        String point2 = input.nextLine();
        String[] point2Items = point2.split(" ");
        double x2 = Double.parseDouble(point2Items[0]);
        double y2 = Double.parseDouble(point2Items[1]);

        // Calculates distance
        double dis = calculateGreatCircleDistance(x1, y1, x2, y2);
        System.out.println(String.format("The distance between the two points is %s km", dis));
    }

    public static double calculateGreatCircleDistance(double x1, double y1, double x2, double y2) {
        double radius = 6371.01; // Radius of the earth in km
        double distance = radius * Math.acos(
                Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1))
                        * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1) - Math.toRadians(y2)));

        return distance;
    }
}
