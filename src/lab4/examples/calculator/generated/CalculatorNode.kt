import kotlin.collections.List

public class CalculatorNode(
  public var name: String?,
  public var text: String? = null,
) {
  public var children: List<CalculatorNode> = emptyList()

  public var `value`: Int = 0

  public override fun toString(): kotlin.String = "$name: $value"
}
