package edu.uob;

public abstract class TwoDimensionalShape {

  private Colour colour;

  public TwoDimensionalShape() {}

  public abstract double calculateArea();

  public abstract int calculatePerimeterLength();

  @Override
  public String toString() {
    return "Colour: " + (colour != null ? colour : "No colour set");
  }

  // Getter
  public Colour getColour() {
    return colour;
  }

  // Setter
  public void setColour(Colour colour) {
    this.colour = colour;
  }
}
