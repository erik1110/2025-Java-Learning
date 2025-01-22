package edu.uob;

public class Main {
    public static void main(String[] args) {
        TwoDimensionalShape shape;

        shape = new Circle(5);
        shape.setColour(Colour.RED);
        System.out.println(shape);

        shape = new Rectangle(5, 6);
        shape.setColour(Colour.BLACK);
        System.out.println(shape);

        shape = new Triangle(3,4,5);
        shape.setColour(Colour.GREEN);
        System.out.println(shape);
    }
}
