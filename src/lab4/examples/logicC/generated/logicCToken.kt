public class logicCToken(
  public val type: logicCTokenType,
  public val text: String?,
) {
  public override fun toString(): kotlin.String = "$type: $text"
}
