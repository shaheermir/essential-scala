import java.util.Date

/**
    * All traits are abstract. You cannot directly create objects out of them.
    * Visitor defines two abstract methods that must be implemented by all subtypes.
    * 1. id and 2. createdAt
    * It also has a concrete method called age that all subtypes automatically inherit.
    */
trait Visitor {
  def id: String // Unique id assigned to each user
  def createdAt: Date // Date this user first visited the site
  // How long has this visitor been around?
  def age: Long = new Date().getTime - createdAt.getTime
}

/**
    *
    * Our classes implement the abstract methods as vals rather than defs. This is legal in Scala,
    * which sees def as a more general version of val. It is good practice to never
    * define vals in a trait, but rather to use def. A concrete implementation can
    * then implement it using using a def or val as appropriate.
    */
case class Anonymous(
    id: String,
    createdAt: Date = new Date()
) extends Visitor

case class User(
    id: String,
    email: String,
    createdAt: Date = new Date()
) extends Visitor

def older(v1: Visitor, v2: Visitor): Boolean =
  v1.createdAt.before(v2.createdAt)

older(Anonymous("1"), User("2", "test@example.com"))