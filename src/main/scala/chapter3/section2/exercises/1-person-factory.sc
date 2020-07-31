class Person(val firstName: String, val lastName: String) {
  def name = s"$firstName $lastName"
}

object Person {
  def apply(fullName: String): Person = {
    val parts = fullName.split(" ")
    new Person(parts(0), parts(1))
  }
}

val shaheer = Person("Shaheer Mir")
shaheer.firstName
shaheer.lastName