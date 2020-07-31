class Cat(val name: String, val color: String, val food: String) {}

object shop {
  def willServe(c: Cat): Boolean = c.food == "Chips"
}

val oswald: Cat = new Cat("Oswald", "Black", "Milk")
val henderson: Cat = new Cat("Henderson", "Ginger", "Chips")

shop.willServe(oswald)
shop.willServe(henderson)