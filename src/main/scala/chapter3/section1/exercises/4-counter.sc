/**
    * Implement a Counter class. The constructor should take an Int. The methods
    * inc and dec should increment and decrement the counter respec􀦞vely
    * returning a new Counter. Here’s an example of the usage:
    */
class Counter(val count: Int) {
  def inc = new Counter(this.count + 1)
  def dec = new Counter(this.count - 1)

}

new Counter(10).inc.dec.inc.inc.count
// res23: Int = 12