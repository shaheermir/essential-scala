class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {
  def name: String = s"$firstName $lastName"
}

class Film(val name: String, val yearOfRelease: Int, val imdbRating: Double, val director: Director) {
  def directorsAge: Int = yearOfRelease - director.yearOfBirth

  def isDirectedBy(d: Director): Boolean = d == this.director
}
