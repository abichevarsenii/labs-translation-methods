// Generated from C:/Users/Arsenii/labs-translation-methods/src/lab4/analyzers/grammarParser\rules.g4 by ANTLR 4.10.1
package lab4.analyzers.grammarParser;
import lab4.analyzers.grammar.Grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link rulesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface rulesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link rulesParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(rulesParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembers(rulesParser.MembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#nodeContext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeContext(rulesParser.NodeContextContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#nonTerminals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTerminals(rulesParser.NonTerminalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#nonTerminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTerminal(rulesParser.NonTerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#right}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(rulesParser.RightContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#terminals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminals(rulesParser.TerminalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal(rulesParser.TerminalContext ctx);
}