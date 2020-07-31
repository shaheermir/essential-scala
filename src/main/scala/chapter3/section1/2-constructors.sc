class Person(first: String, last: String) {
  val firstName = first
  val lastName = last

  def name = s"$firstName $lastName"
}

val shaheer = new Person("Shaheer", "Mir")