package edu.uob;

public class Main {
    public static void main(String[] args) {
        TwoDimensionalShape shape;

        shape = new Circle(5);
        System.out.println("The shape is: " + shape);

        shape = new Rectangle(5, 6);
        System.out.println("The shape is: " + shape);

        shape = new Triangle(3,4,5);
        System.out.println("The shape is: " + shape);
    }
}
