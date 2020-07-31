class Person(val firstName: String, val lastName: String) {
  def name = s"$firstName $lastName"

  def greet(firstName: String = "some", lastName: String = "body") =
    s"Greetings $firstName $lastName!"
}

// keyword - params. we can specify params in an arbitrary order.
val shaheer = new Person(lastName = "Mir", firstName = "Shaheer")

shaheer.greet(firstName = "Kaz", lastName = "Mishima")
shaheer.greet()
shaheer.greet(lastName = "yo")

