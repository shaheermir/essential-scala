/**
  * Extend Counter to add a method called adjust. This method should accept
  * an Adder and return a new Counter with the result of applying the Adder to
  * the count.
  */
class Adder(amount: Int) {
  def add(in: Int) = in + amount
}

class Counter(val count: Int) {
  def dec: Counter = dec()
  def inc: Counter = inc()
  def inc(amount: Int = 1) = new Counter(this.count + amount)
  def dec(amount: Int = 1) = new Counter(this.count - amount)
  def adjust(adder: Adder) = new Counter(adder.add(count))
}
