public class CalculatorToken(
  public val type: CalculatorTokenType,
  public val text: String?,
) {
  public override fun toString(): kotlin.String = "$type: $text"
}
