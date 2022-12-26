package lab4.examples.calculator.visualizer

import CalculatorLexer
import CalculatorNode
import CalculatorParser
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
    val str = "5 + 7 * 9"
    val res = CalculatorParser(CalculatorLexer(str)).e()
    Visualizer("src/lab4/examples/calculator/visualizer/graph.png").visualizeGraph(res)
}

class Visualizer  (private val path : String) {
    private var id = 0

    private fun walkGraph(node: CalculatorNode): MutableNode {
        id = 0
        return map(node)
    }

    fun map(node: CalculatorNode) : MutableNode {
        return if (node.isTerminal){
            Factory.mutNode(getID()).add(Label.of(node.text!!)).add(Shape.BOX).add(Color.RED)
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

    fun visualizeGraph(node: CalculatorNode) {
        val g: MutableGraph = Factory.mutGraph("graph").setDirected(true).add(
            walkGraph(node)
        )
        Graphviz.fromGraph(g).width(1000).render(Format.PNG).toFile(File(path))
    }

    private fun getID(): String {
        val res = id
        id++
        return res.toString()
    }
}