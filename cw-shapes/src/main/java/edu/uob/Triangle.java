package edu.uob;

public class Triangle extends TwoDimensionalShape{
  private int side1;
  private int side2;
  private int side3;
  // TODO implement me!
  public Triangle(int side1, int side2, int side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }
  public int getLongestSide() {
    if (this.side1 > this.side2 && this.side1 > this.side3) {
      return this.side1;
    } else if (this.side2 > this.side1 && this.side2 > this.side3) {
      return this.side2;
    } else {
      return this.side3;
    }
  }
  // TODO implement me!
  public double calculateArea() {
    return 0;
  }

  // TODO implement me!
  public int calculatePerimeterLength() {
    return 0;
  }

  public String toString() {
    return this.getClass().getSimpleName() +" with 3 sides: " + this.side1 + " " + this.side2 + " " + this.side3 + ", " + super.toString();
  }
}
