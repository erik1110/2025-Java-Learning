package edu.uob;

import java.util.Random;

import java.sql.SQLOutput;

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
        System.out.println("Triangle Area: " + triangle2.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle2.calculatePerimeterLength());

        TwoDimensionalShape[] shapes = new TwoDimensionalShape[100];
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            double randomValue = Math.random();
                if (randomValue < 0.33) {
                    shapes[i] = new Circle((int) Math.ceil(rand.nextDouble() * 10));
                } else if (randomValue < 0.66) {
                    shapes[i] = new Rectangle((int) Math.ceil(rand.nextDouble() * 10), (int) Math.ceil(rand.nextDouble() * 10));
                } else {
                    shapes[i] = new Triangle((int) Math.ceil(rand.nextDouble() * 10), (int) Math.ceil(rand.nextDouble() * 10), (int) Math.ceil(rand.nextDouble() * 10));
                }
        }
        for (TwoDimensionalShape myShape : shapes) {
            System.out.println("---------------------------");
            System.out.println(myShape);
        }
        System.out.println("------------- RESULT ----------");
        System.out.println("Total number of triangles: " + Triangle.getPopulationSize());
    }
}
