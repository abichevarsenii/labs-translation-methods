package visualizer

import guru.nidi.graphviz.attribute.Color
import guru.nidi.graphviz.attribute.Label
import guru.nidi.graphviz.attribute.Shape
import guru.nidi.graphviz.engine.Format
import guru.nidi.graphviz.engine.Graphviz
import guru.nidi.graphviz.model.Factory.mutGraph
import guru.nidi.graphviz.model.Factory.mutNode
import guru.nidi.graphviz.model.MutableGraph
import guru.nidi.graphviz.model.MutableNode
import parser.Parser
import parser.Tree
import java.io.File


fun main() {
    val str = "!!a"
    val res = Parser().parse(str.byteInputStream())
    Visualizer().visualizeGraph(res)
}

class Visualizer {
    private var id = 0
    private fun walkGraph(node: Tree.Node): MutableNode {
        id = 0
        return node.map({ n -> mutNode(getID()).add(Label.of(n.name)) }, {a,b -> a.addLink(b) },{n -> mutNode(getID()).add(Label.of(n.name)).add(Shape.BOX).add(Color.RED)})
    }
    fun visualizeGraph(node: Tree.Node) {
        val g: MutableGraph = mutGraph("graph").setDirected(true).add(
            walkGraph(node)
        )
        Graphviz.fromGraph(g).width(1000).render(Format.PNG).toFile(File("src/lab2/visualizer/graph.png"))
    }

    private fun getID(): String {
        val res = id
        id++
        return res.toString()
    }
}