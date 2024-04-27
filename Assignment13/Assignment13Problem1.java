/**
 * Daniel Wedding
 * CompSci 1060
 * 04/26/24
 * 
 * Assignment 13 Problem 1
 * Rectangle Example
 */
public class Assignment13Problem1 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.print("Rectangle 1 - ");
        rect1.display();
        System.out.print("Rectangle 2 - ");
        rect2.display();
    }
}

class Rectangle {
    double width;
    double height;

    Rectangle(){
        this.width = 1;
        this.height = 1;
    }

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    double getArea(){
        return width * height;
    }

    double getPerimeter(){
        return (2 * width) + (2 * height);
    }

    void display(){
        System.out.println(String.format("Width: %.2f | Height: %.2f | Area: %.2f | Perimeter: %.2f", width, height, getArea(), getPerimeter()));
    }
}