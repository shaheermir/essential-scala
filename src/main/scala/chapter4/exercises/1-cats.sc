// Demand for Cat Simulator 1.0 is exploding! For v2 we’re going to go beyond
// the domes􀦞c cat to model Tigers, Lions, and Panthers in addi􀦞on to the Cat.
// Define a trait Feline and then define all the different species as subtypes of
// Feline. To make things interes􀦞ng, define:
// on Feline a colour as before;
// on Feline a String sound, which for a cat is "meow" and is "roar"
// for all other felines;
// only Cat has a favourite food; and
// Lions have an Int maneSize.

trait Feline {
  def color: String
  def sound: String
}

trait BigCat extends Feline {
  override def sound = "Roar"
}
case class Tiger(color: String) extends BigCat

case class Panther(color: String) extends BigCat

case class Lion(color: String, maneSize: Int) extends BigCat

case class Cat(color: String, food: String) extends Feline {
  val sound = "Meow"
}
