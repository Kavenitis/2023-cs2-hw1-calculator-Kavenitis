package calculator.model

abstract class State(calc: Calculator){
  def numberPressed(number: Int)
  def dividePressed()
  def multiplyPressed()
  def subtractPressed()
  def addPressed()
  def equalsPressed()
  def decimalPressed()
  def clearPressed()
}
