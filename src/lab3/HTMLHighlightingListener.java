// Generated from C:/Users/Arsenii/Downloads/labs-translation-methods/src/lab3\HTMLHighlighting.g4 by ANTLR 4.10.1
package lab3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLHighlightingParser}.
 */
public interface HTMLHighlightingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(HTMLHighlightingParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(HTMLHighlightingParser.StartContext ctx);
}