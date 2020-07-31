/**
 * Two special types: Null and Nothing
 * Nothing is the type of throw expressions, and Null is the type of the value null.
 * These special types are subtypes of everything else, which helps us assign types to
 * throw and null while keeping other types in our code sane.
 */

def badness = throw new Exception("Error")
// badness: Nothing

def otherbadness = null
// otherbadness: Null

val bar = if (true) 123 else badness
// bar: Int = 123

val baz = if (false) "it worked" else otherbadness
// baz: String = null

