package edu.uob;

public class Triangle extends TwoDimensionalShape{
  private int side1;
  private int side2;
  private int side3;

  private int sum1;
  private int sum2;
  private int sum3;

  private TriangleVariant variant;
  // TODO implement me!
  public Triangle(int side1, int side2, int side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    this.sumTwoSide();
    this.determineVariant();
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
  @Override
  public double calculateArea() {
    double s = (this.side1 + this.side2 + this.side3 ) / 2.0;
    return Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
  }

  // TODO implement me!
  @Override
  public int calculatePerimeterLength() {
    return this.side1 + this.side2 + this.side3;
  }

  public String toString() {
    return this.getClass().getSimpleName() +" with 3 sides: " + this.side1 + " " + this.side2 + " " + this.side3 + ", " + super.toString();
  }

  public TriangleVariant getVariant() {
    return this.variant;
  }

  private void sumTwoSide(){
    this.sum1 = this.side1 + this.side2;
    this.sum2 = this.side2 + this.side3;
    this.sum3 = this.side3 + this.side1;
  }

  private boolean isFlatTriangle() {
    return this.sum1 == this.side3 || this.sum2 == this.side1 || this.sum3 == this.side2 ;
  }

  private boolean isOverflow() {
    if (this.sum1 <= 0 || this.sum2 <= 0 || this.sum3 <= 0) {
      return true;
    } else if (Math.pow(this.side1, 2) <=0 || Math.pow(this.side1, 2) > Integer.MAX_VALUE ||
               Math.pow(this.side2, 2) <=0 || Math.pow(this.side2, 2) > Integer.MAX_VALUE ||
               Math.pow(this.side3, 2) <=0 || Math.pow(this.side3, 2) > Integer.MAX_VALUE) {
      return true;
    }
    return false;
  }

  private void determineVariant() {

    if (this.side1 <= 0 || this.side2 <= 0 || this.side3 <= 0) {
      this.variant = TriangleVariant.ILLEGAL;
    } else if (this.isOverflow()) {
      this.variant = TriangleVariant.SCALENE;
    } else if (this.sum1 < this.side3 || this.sum2 < this.side1 || this.sum3 < this.side2) {
      this.variant = TriangleVariant.IMPOSSIBLE;
    } else if (isFlatTriangle()) {
      this.variant = TriangleVariant.FLAT;
    } else if  (this.side1 == this.side2 && this.side1 == this.side3) {
      this.variant = TriangleVariant.EQUILATERAL;
    } else if (this.side1 == this.side2 || this.side1 == this.side3 || this.side2 == this.side3) {
      this.variant = TriangleVariant.ISOSCELES;
    } else if (Math.pow(this.side1, 2) + Math.pow(this.side2, 2) == Math.pow(this.side3, 2) ||
               Math.pow(this.side2, 2) + Math.pow(this.side3, 2) == Math.pow(this.side1, 2) ||
               Math.pow(this.side3, 2) + Math.pow(this.side1, 2) == Math.pow(this.side2, 2)) {
      this.variant = TriangleVariant.RIGHT;
    } else if (this.side1 != this.side3 && this.side2 != this.side3 && this.side1 != this.side2) {
      this.variant = TriangleVariant.SCALENE;
    } else {
      this.variant = null;
    }
  }
}
