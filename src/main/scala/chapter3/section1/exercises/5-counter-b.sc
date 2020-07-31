/**
    * Implement a Counter class. The constructor should take an Int. The methods
    * inc and dec should increment and decrement the counter respec􀦞vely
    * returning a new Counter. Here’s an example of the usage:
    */
class Counter(val count: Int) {
  def dec: Counter = dec()
  def inc: Counter = inc()
  def inc(amount: Int = 1) = new Counter(this.count + amount)
  def dec(amount: Int = 1) = new Counter(this.count - amount)
}

new Counter(10).inc.inc(10).count
// res25: Int = 21