class Director(
    val firstName: String,
    val lastName: String,
    val yearOfBirth: Int
) {
  def name: String =
    s"$firstName $lastName"
  def copy(
      firstName: String = this.firstName,
      lastName: String = this.lastName,
      yearOfBirth: Int = this.yearOfBirth
  ) =
    new Director(firstName, lastName, yearOfBirth)
}

object Director {
  def apply(firstName: String, lastName: String, yearOfBirth: Int): Director =
    new Director(firstName, lastName, yearOfBirth)

  def older(d1: Director, d2: Director) =
    if (d1.yearOfBirth < d2.yearOfBirth) d1 else d2
}

class Film(
    val name: String,
    val yearOfRelease: Int,
    val imdbRating: Double,
    val director: Director
) {
  def directorsAge: Int =
    yearOfRelease - director.yearOfBirth

  def isDirectedBy(d: Director): Boolean =
    d == this.director

  def copy(
      name: String = this.name,
      yearOfRelease: Int = this.yearOfRelease,
      imdbRating: Double = this.imdbRating,
      director: Director = this.director
  ): Film =
    new Film(name, yearOfRelease, imdbRating, director)
}

object Film {
  def apply(
      name: String,
      yearOfRelease: Int,
      imdbRating: Double,
      director: Director
  ): Film =
    new Film(name, yearOfRelease, imdbRating, director)

  def highestRating(f1: Film, f2: Film): Film =
    if (f1.imdbRating > f2.imdbRating) f1 else f2

  def oldestDirectorAtTheTime(f1: Film, f2: Film): Director = {
    if (f1.directorsAge > f2.directorsAge)
      f1.director
    else
      f2.director
  }
}
