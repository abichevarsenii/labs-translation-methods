import kotlin.collections.List

public class LogicCNode(
  public var name: String?,
  public var text: String? = null,
) {
  public var children: List<LogicCNode> = emptyList()

  public var isTerminal: kotlin.Boolean = false

  public var `value`: Boolean = false

  public override fun toString(): kotlin.String = "$name: $value"
}
