case class Cat(color: String, food: String)

object ChipShop {
  def willServe(cat: Cat): Boolean = {
    cat match {
      case Cat(_, "Chips") => true
      case Cat(_, _)       => false
    }
  }
}

val oswald = Cat("Black", "Milk")
val henderson = Cat("Ginger", "Chips")

ChipShop.willServe(oswald)
ChipShop.willServe(henderson)