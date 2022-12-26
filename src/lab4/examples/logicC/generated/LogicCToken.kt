public class LogicCToken(
  public val type: LogicCTokenType,
  public val text: String?,
) {
  public override fun toString(): kotlin.String = "$type: $text"
}
