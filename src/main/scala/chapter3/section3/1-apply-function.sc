/**
    * In the final exercise of the previous sec􀦞on, we defined a class called Adder:
    * In the discussion we described an Adder as an object representing a
    * computation—a bit like having a method that we can pass around as a value.
    * This is such a powerful concept that Scala has a fully blown set of language
    * features for creating objects that behave like computations. These objects are
    * called func􀢼ons, and are the basis of functional programming.
    *
    * In Scala, by convention, an object can be “called” like a func􀦞on if it has a
    * method called apply. Naming a method apply affords us a special shortened
    * call syntax: foo.apply(args) becomes foo(args).
    */
class Adder(amount: Int) {
  def apply(in: Int): Int = in + amount
}

val add3 = new Adder(3)
add3.apply(2)
add3(2)

// With this one simple trick, objects can “look” syntac􀦞cally like func􀦞ons. There
// are lots of things that we can do with objects that we can’t do with methods,
// including assign them to variables and pass them around as arguments.