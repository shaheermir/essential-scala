case class Person(firstName: String, lastName: String) {
  def name = firstName + " " + lastName
}

val dave1 = new Person("Dave", "Chappelle")
val dave2 = new Person("Dave", "Chappelle")

// Scala’s == operator is different from Java’s—it delegates to equals
// rather than comparing values on reference identity.
dave1 == dave2

// Scala has an operator called eq with the same behaviour as Java’s ==.
// However, it is rarely used in application code.
dave1 eq dave2 // false
dave1 eq dave1 // true