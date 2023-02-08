package calculator.model

class SubtractStateCheck(calc: Calculator) extends State(calc) {
  override def decimalPressed(): Unit = {
    calc.operativeNum = "0."
    calc.input = "0."
    calc.state = new decimalPressedAddState(calc)
  }
  override def numberPressed(digit: Int): Unit = {
    calc.operativeNum += digit.toString
    calc.input += digit.toString
    calc.state = new subtractState(calc)
  }
  override def subtractPressed(): Unit = {
    calc.operativeNum += "-"
    calc.input += "-"
    calc.state = new subtractState(calc)
  }
  override def equalsPressed(): Unit = {
  }
  override def addPressed(): Unit = {
    calc.state = new AddStateCheck(calc)
  }
  override def multiplyPressed(): Unit = {
    calc.state = new MultiplyStateCheck(calc)
  }
  override def dividePressed(): Unit = {
    calc.state = new DivideStateCheck(calc)
  }
  override def clearPressed(): Unit = {
    calc.state = new zeroDigitBaseState(calc)
  }
}
