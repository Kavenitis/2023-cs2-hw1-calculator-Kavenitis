package calculator.model

class BaseState(calc: Calculator) extends State(calc){
  override def decimalPressed(): Unit = {
    calc.input += "."
    calc.state = new DecimalBaseState(calc)
  }
  override def numberPressed(digit: Int): Unit = {
    calc.input += digit
  }
  override def addPressed(): Unit = {
    calc.baseNum = calc.input.toDouble
    calc.state = new AddStateCheck(calc)
    calc.input = ""
  }
  override def subtractPressed(): Unit = {
    calc.baseNum = calc.input.toDouble
    calc.state = new SubtractStateCheck(calc)
    calc.input = ""
  }
  override def multiplyPressed(): Unit = {
    calc.baseNum = calc.input.toDouble
    calc.state = new MultiplyStateCheck(calc)
    calc.input = ""
  }
  override def dividePressed(): Unit = {
    calc.baseNum = calc.input.toDouble
    calc.state = new DivideStateCheck(calc)
    calc.input = ""
  }
  override def equalsPressed(): Unit = {

  }
  override def clearPressed(): Unit = {
    calc.state = new zeroDigitBaseState(calc)
  }
}

