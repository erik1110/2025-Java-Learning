package edu.uob;

public class Rectangle extends TwoDimensionalShape {
  int width;
  int height;

  public Rectangle(int w, int h) {
    width = w;
    height = h;
  }

  public double calculateArea() {
    return width * height;
  }

  public int calculatePerimeterLength() {
    return 2 * (width + height);
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + " of dimensions " + width + " x " + height + ", " + super.toString();
  }
}
