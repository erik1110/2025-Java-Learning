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

        Triangle triangle1 = new Triangle(5,5,5);
        triangle1.setColour(Colour.GREEN);
        System.out.println(triangle1);
        System.out.println("TriangleVariant: " + triangle1.getVariant());

        Triangle triangle2 = new Triangle(5,4,3);
        triangle2.setColour(Colour.GREEN);
        System.out.println(triangle2);
        System.out.println("TriangleVariant: " + triangle2.getVariant());
    }
}
