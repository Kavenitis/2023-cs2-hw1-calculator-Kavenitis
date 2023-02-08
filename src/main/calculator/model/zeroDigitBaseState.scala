package calculator.model
import calculator.model.Calculator


class zeroDigitBaseState(calc: Calculator) extends State(calc) {
  override def decimalPressed(): Unit = {
    calc.input += "."
    calc.state = new DecimalBaseState(calc)
  }

  override def numberPressed(digit: Int): Unit = {
    calc.input = digit.toString
    calc.state = new BaseState(calc)
  }

  override def subtractPressed(): Unit = {
    calc.input = "-"
    calc.state = new BaseState(calc)
  }

  override def dividePressed(): Unit = ???

  override def multiplyPressed(): Unit = ???

  override def addPressed(): Unit = ???

  override def equalsPressed(): Unit = ???

  override def clearPressed(): Unit = ???
}
