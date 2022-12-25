import kotlin.collections.List

public class logicCNode(
  public var name: String?,
  public var text: String? = null,
) {
  public var children: List<logicCNode> = emptyList()

  public var `value`: Boolean = false

  public override fun toString(): kotlin.String = "$name: $value"
}
