/**
    * Sometimes we want to create a method that logically belongs to a class but
    * is independent of any particular object. In Java we would use a static method
    * for this, but Scala has a simpler solution that we’ve seen already: singleton
    * objects.
    */
class Timestamp(val seconds: Long)

object Timestamp {
  def apply(hours: Int, minutes: Int, seconds: Int): Timestamp =
    new Timestamp(hours * 60 * 60 + minutes * 60 + seconds)
}

Timestamp(1, 1, 1).seconds

// Scala does allow for multiple constructors but almost everyone prefers
// this technique instead.

/**
    * Note the following two things.
    * 1. Scala has two namespaces as its evident above. One for types, and one for values.
    * 2.It is important to note that the companion object is not an instance of the class—it
    * is a singleton object with its own type:
    */
Timestamp
val t = new Timestamp(60)