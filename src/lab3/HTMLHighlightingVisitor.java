// Generated from C:/Users/Arsenii/Downloads/labs-translation-methods/src/lab3\HTMLHighlighting.g4 by ANTLR 4.10.1
package lab3;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLHighlightingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLHighlightingVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(HTMLHighlightingParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#headerNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderNode(HTMLHighlightingParser.HeaderNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#packageNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageNode(HTMLHighlightingParser.PackageNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#importNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNode(HTMLHighlightingParser.ImportNodeContext ctx);
}