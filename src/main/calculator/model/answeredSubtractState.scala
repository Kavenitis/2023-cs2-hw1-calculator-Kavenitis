package calculator.model

class answeredSubtractState(calc: Calculator) extends State(calc){
  override def decimalPressed(): Unit = {
    calc.operativeNum = ""
    calc.input = "0."
    calc.state = new BaseState(calc)
  }
  override def numberPressed(digit: Int): Unit = {
    calc.operativeNum = ""
    calc.input = digit.toString
    calc.state = new BaseState(calc)
  }
  override def addPressed(): Unit = {
    calc.operativeNum = ""
    calc.baseNum = calc.input.toDouble
    calc.state = new AddStateCheck(calc)
    calc.input = ""
  }
  override def subtractPressed(): Unit = {
    calc.operativeNum = ""
    calc.baseNum = calc.input.toDouble
    calc.state = new SubtractStateCheck(calc)
    calc.input = ""
  }
  override def multiplyPressed(): Unit = {
    calc.operativeNum = ""
    calc.baseNum = calc.input.toDouble
    calc.state = new MultiplyStateCheck(calc)
    calc.input = ""
  }
  override def dividePressed(): Unit = {
    calc.operativeNum = ""
    calc.baseNum = calc.input.toDouble
    calc.state = new DivideStateCheck(calc)
    calc.input = ""
  }
  override def equalsPressed(): Unit = {
    calc.answer(calc.input.toDouble - calc.operativeNum.toDouble)
  }
  override def clearPressed(): Unit = {
    calc.state = new zeroDigitBaseState(calc)
  }
}
