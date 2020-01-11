val d = 0.000000001
val bd = new java.math.BigDecimal(0.000000001)
case class CheckSumBigDecimal(bd: java.math.BigDecimal){
  override def toString: String = String.format("%9f.",bd.toPlainString)
}
val csbd = CheckSumBigDecimal(bd)
