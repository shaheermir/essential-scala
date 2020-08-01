/**
    * Whenever we declare a case class, Scala automatically generates a class and
    * companion object. The class and companion object both come with a lot of
    * features and some sensible defaults.
    */
case class Person(firstName: String, lastName: String) {
  def name = firstName + " " + lastName
}

val jin = new Person("Jin", "Kazama")
val kazuya = Person("Kazuya", "Mishima")

// 1. Notice how Jin automatically gets the constructor params as fields.
// We didn't even have to use the val keyword in the constructor params.
jin.firstName
jin.lastName

// 2. A default toString method that prints a sensible constructor-like
// representation of the class.
println(jin)
println(kazuya)

// 3. Sensible equals, and hashCode methods that operate on the field values
// in the object. This makes it easy to use case classes with collections like Lists, Sets and
// Maps. It also means we can compare objects on the basis of their contents
// rather than their reference identity
new Person("Bryan", "Fury").equals(new Person("Bryan", "Fury"))

// 4.A copy method that creates a new object with the same field values as
// the current object
jin.copy() // res5: Person = Person(Jin,Kazama)
jin.copy(lastName = "Mishima") // res6: Person = Person(Jin,Mishima)

// 5. Case classes implement two traits: java.io.Serializable and
// scala.Product. Neither are used directly. The la􀂂er provides
// methods for inspec􀦞ng the number of fields and the name of the case
// class.

// As for the companion object. It contains an apply method with the same arguments
//as the class constructor. Scala programmers tend to prefer the apply method
//over the constructor for the brevity of omi􀦮ng new, which makes constructors
//much easier to read inside expressions:
Person("Dave", "Gurnell") == Person("Noel", "Welsh")
Person("Dave", "Gurnell") == Person("Dave", "Gurnell")