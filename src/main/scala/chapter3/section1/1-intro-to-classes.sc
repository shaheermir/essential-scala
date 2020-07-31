class Person {
  val firstName = "Shaheer"
  val lastName = "Mir"

  def name = s"$firstName $lastName"
}

object alien {
  def greet(p: Person) =
    "Greetings, " + p.firstName + " " + p.lastName
}


val shaheer = new Person
alien.greet(shaheer)