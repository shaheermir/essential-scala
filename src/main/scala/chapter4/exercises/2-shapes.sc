//Define a trait called Shape and give it three abstract methods:
//• sides returns the number of sides;
//• perimeter returns the total length of the sides;
//• area returns the area.
//Implement Shape with three classes: Circle, Rectangle, and Square. In
//each case provide implementa􀦞ons of each of the three methods. Ensure that
//the main constructor parameters of each shape (e.g. the radius of the circle)
//are accessible as fields.

import math.Pi

trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
}

sealed trait Rectangular extends Shape {
  val sides = 4
  def width: Double
  def height: Double

  override val perimeter = 2 * width + 2 * height
  override val area = width * height
}

case class Circle(radius: Double) extends Shape {
  val sides = 1
  val perimeter: Double = 2 * Pi * radius
  val area: Double = Pi * radius * radius
}

case class Rectangle(width: Double, height: Double) extends Rectangular {}

case class Square(size: Double) extends Rectangular {
  val width = size
  val height = size
}
