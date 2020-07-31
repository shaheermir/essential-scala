println("Welcome to the Scala worksheets!")

if (20 > 10) "left" else "right"

"shaheer".toUpperCase
"shaheer".toUpperCase()


object Person1 {
  def name: String = "My name is Shaheer!"

  def hello(name: String) = "Hello " + name
}

Person1.hello("Mir")

object Person2 {
  val name = "Shaheer"

  def hello(other: String): String = name + " says hello to " + other
}

Person2.hello("Kaz")


object Test7 {
  val simpleField = {
    println("Evaluating simpleField")
    42
  }

  def noParameterMethod = {
    println("Evaluating noParameterMethod")
    42
  }
}

Test7




