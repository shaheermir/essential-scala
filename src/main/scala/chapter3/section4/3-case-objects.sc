// If you find yourself defining a case class with no constructor
// arguments you can instead a define a case object. A case object is defined just
// like a regular singleton object, but has a more meaningful toString method
// and extends the Product and Serializable traits:
case object Citizen {
  def firstName = "John"
  def lastName = "Doe"
  def name = firstName + " " + lastName
}

println(Citizen)