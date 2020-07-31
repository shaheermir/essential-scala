object person {
  val firstName = "Shaheer"
  val lastName = "Mir"
}

object alien {
  def greet(p: person.type): String = s"Greetings ${p.firstName}!"
}

alien.greet(person)