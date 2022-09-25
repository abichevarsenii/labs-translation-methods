package parser


class Tree {
    abstract class Node(val name: String) {
        abstract fun <R> map(func: (Node) -> R, sum: (R, R) -> Unit, endFunc: (Node) -> R) : R
    }
    class Terminal(name: String) : Node(name) {
        override fun <R> map(func: (Node) -> R, sum: (R, R) -> Unit, endFunc: (Node) -> R) : R {
            return endFunc(this)
        }

        override fun toString(): String {
            return name
        }
    }

    class NonTerminal(name: String) : Node(name) {
        var children: List<Node> = mutableListOf()
        fun add(node: Node) {
            children = children.plus(node)
        }

        override fun <R> map(func: (Node) -> R, sum: (R, R) -> Unit, endFunc: (Node) -> R) : R {
            val parent = func(this)
            val ch = children.map{node -> node.map(func,sum,endFunc)}
            ch.forEach { item -> sum(parent, item) }
            return parent
        }

        override fun toString(): String {
            return " $name${children.joinToString("\n ", "\n  ", "", -1, "") { node -> node.toString() }}"
        }
    }
}