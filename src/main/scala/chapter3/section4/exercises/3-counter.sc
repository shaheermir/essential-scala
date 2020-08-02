case class Counter(count: Int) {
  def dec: Counter = dec()
  def inc: Counter = inc()
  def inc(amount: Int = 1) = new Counter(this.count + amount)
  def dec(amount: Int = 1) = new Counter(this.count - amount)
}
