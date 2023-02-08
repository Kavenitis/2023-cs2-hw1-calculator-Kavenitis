package calculator.model


class Calculator() {
  var input: String = "0"
  var baseNum: Double = 0
  var operativeNum: String = ""


  var state: State = new zeroDigitBaseState(this)  // init state


  def displayNumber(): Double = {
    input.toDouble
  }

  def numberPressed(number: Int): Unit = {
    this.state.numberPressed(number)
  }
  def dividePressed(): Unit = {
    this.state.dividePressed()
  }
  def multiplyPressed(): Unit = {
    this.state.multiplyPressed()
  }
  def subtractPressed(): Unit = {
    this.state.subtractPressed()
  }
  def addPressed(): Unit = {
    this.state.addPressed()
  }
  def equalsPressed(): Unit = {
    this.state.equalsPressed()
  }
  def decimalPressed(): Unit = {
    this.state.decimalPressed()
  }

  def clearPressed(): Unit = {
    this.input = "0.0"
    this.baseNum = 0
    this.operativeNum = ""
    this.state = new zeroDigitBaseState(this)
  }
  def answer(num: Double): Unit = {
    this.input = num.toString
    this.baseNum = 0
  }
}
