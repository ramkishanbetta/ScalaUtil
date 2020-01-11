//scala Double
val double = 0.000000001
case class FormattedDouble(double: Double){
  override def toString: String = String.format("%.9f", double)
}
val formattedDouble = FormattedDouble(double)

//scala BigDecimal
val bigDecimal = new BigDecimal(new java.math.BigDecimal(0.000000001), BigDecimal.defaultMathContext)
case class FormattedScalaBigDecimal(bigDecimal: BigDecimal){
  override def toString: String = String.format("%.9f", bigDecimal.doubleValue)
}
val formattedScalaBigDecimal = FormattedScalaBigDecimal(bigDecimal)

//Java BigDecimal
val javaBigDecimal = new java.math.BigDecimal(0.000000001)
case class FormattedJavaBigDecimal(javaBigDecimal: java.math.BigDecimal){
  override def toString: String = String.format("%.9f", javaBigDecimal)
}
val formattedJavaBigDecimal = FormattedJavaBigDecimal(javaBigDecimal)