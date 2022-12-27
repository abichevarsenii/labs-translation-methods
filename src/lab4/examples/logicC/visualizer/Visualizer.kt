package lab4.examples.logicC.visualizer


import LogicCLexer
import LogicCNode
import LogicCParser
import guru.nidi.graphviz.attribute.Color
import guru.nidi.graphviz.attribute.Label
import guru.nidi.graphviz.attribute.Shape
import guru.nidi.graphviz.engine.Format
import guru.nidi.graphviz.engine.Graphviz
import guru.nidi.graphviz.model.Factory
import guru.nidi.graphviz.model.MutableGraph
import guru.nidi.graphviz.model.MutableNode
import java.io.File

fun main() {
    val str = "a & b | c"
    val res = LogicCParser(LogicCLexer(str)).a(mapOf("a" to false, "b" to false, "c" to true))
    Visualizer("src/lab4/examples/logicC/visualizer/graph.png").visualizeGraph(res)
}

class Visualizer(private val path : String) {
    private var id = 0

    private fun walkGraph(node: LogicCNode): MutableNode {
        id = 0
        return map(node)
    }

    fun map(node: LogicCNode) : MutableNode {
        return if (node.isTerminal){
            if (node.name == "VAR") {
                Factory.mutNode(getID()).add(Label.of(node.text!! + " : " + node.value.toString())).add(Shape.BOX).add(Color.RED)
            } else {
                Factory.mutNode(getID()).add(Label.of(node.text!!)).add(Shape.BOX).add(Color.RED)
            }
        } else {
            val parent = Factory.mutNode(getID()).add(Label.of(node.name!!))
            if (node.children.isEmpty()){
                val item = Factory.mutNode(getID()).add(Label.of("EPS")).add(Shape.BOX).add(Color.RED)
                parent.addLink(item)
            } else {
                val ch = node.children.map{n -> map(n)}
                ch.forEach { item -> parent.addLink(item) }
            }
            parent
        }
    }

    fun visualizeGraph(node: LogicCNode) {
        val g: MutableGraph = Factory.mutGraph("graph").setDirected(true).add(
            walkGraph(node)
        )
        Graphviz.fromGraph(g).width(1500).render(Format.PNG).toFile(File(path))
    }

    private fun getID(): String {
        val res = id
        id++
        return res.toString()
    }
}