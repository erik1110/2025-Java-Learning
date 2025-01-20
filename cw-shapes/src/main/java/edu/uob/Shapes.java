package edu.uob;

public class Shapes {

  // TODO use this class as then entry point; play around with your shapes, etc
  public static void main(String[] args) {

    Triangle testTriangle = new Triangle(5, 7, 9);
    int longestSide = testTriangle.getLongestSide();
    System.out.println("The longest side of the triangle is " + longestSide);
  }
}
