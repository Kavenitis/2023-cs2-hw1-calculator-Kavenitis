package calculator.model

class subtractState(calc: Calculator) extends State(calc) {
  override def decimalPressed(): Unit = {
    calc.operativeNum += "."
    calc.input += "."
    calc.state = new decimalPressedSubtractState(calc)
  }
  override def numberPressed(digit: Int): Unit = {
    calc.operativeNum += digit
    calc.input += digit
  }
  override def subtractPressed(): Unit = {
    calc.baseNum = calc.baseNum - calc.operativeNum.toDouble
    calc.operativeNum = ""
    calc.input = ""
    calc.state = new SubtractStateCheck(calc)
  }
  override def equalsPressed(): Unit = {
    calc.answer(calc.baseNum - calc.operativeNum.toDouble)
    calc.state = new answeredSubtractState(calc)
  }
  override def addPressed(): Unit = {
    calc.baseNum = calc.baseNum - calc.operativeNum.toDouble
    calc.operativeNum = ""
    calc.input = ""
    calc.state = new AddStateCheck(calc)
  }
  override def multiplyPressed(): Unit = {
    calc.baseNum = calc.baseNum - calc.operativeNum.toDouble
    calc.operativeNum = ""
    calc.input = ""
    calc.state = new MultiplyStateCheck(calc)
  }
  override def dividePressed(): Unit = {
    calc.baseNum = calc.baseNum - calc.operativeNum.toDouble
    calc.operativeNum = ""
    calc.input = ""
    calc.state = new DivideStateCheck(calc)
  }
  override def clearPressed(): Unit = {
    calc.state = new zeroDigitBaseState(calc)
  }
}

