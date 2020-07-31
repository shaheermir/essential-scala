class Person(val firstName: String, val lastName: String) {
  def name = s"$firstName $lastName"
}

val shaheer = new Person("Shaheer", "Mir")