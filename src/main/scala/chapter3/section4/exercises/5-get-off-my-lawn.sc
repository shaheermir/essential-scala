case class Director(firstName: String, lastName: String, yearOfBirth: Int) {
  def name: String = s"$firstName $lastName"
}

object Director {
  def older(d1: Director, d2: Director) =
    if (d1.yearOfBirth < d2.yearOfBirth) d1 else d2
}

case class Film(
    name: String,
    yearOfRelease: Int,
    imdbRating: Double,
    director: Director
) {
  def directorsAge = yearOfRelease - director.yearOfBirth
  def isDirectedBy(d: Director) = d == this.director
}

object Film {
  def newer(film1: Film, film2: Film): Film =
    if (film1.yearOfRelease < film2.yearOfRelease) film1 else film2

  def highestRating(f1: Film, f2: Film): Film =
    if (f1.imdbRating > f2.imdbRating) f1 else f2

  def oldestDirectorAtTheTime(f1: Film, f2: Film): Director = {
    if (f1.directorsAge > f2.directorsAge) f1.director else f2.director
  }
}

object Dad {
  def rate(film: Film): Double = {
    film match {
      case Film(_, _, _, Director("Clint", "Eastwood", _)) => 10.0
      case Film(_, _, _, Director("John", "McTiernan", _)) => 7.0
      case Film(_, _, _, _)                                => 3.0
    }
  }
}
