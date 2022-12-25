// Generated from java-escape by ANTLR 4.11.1
package lab4.analyzers.grammarParser;
import lab4.analyzers.grammar.Grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rulesParser}.
 */
public interface rulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link rulesParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(rulesParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(rulesParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void enterGrammarName(rulesParser.GrammarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void exitGrammarName(rulesParser.GrammarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#members}.
	 * @param ctx the parse tree
	 */
	void enterMembers(rulesParser.MembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#members}.
	 * @param ctx the parse tree
	 */
	void exitMembers(rulesParser.MembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#nodeContext}.
	 * @param ctx the parse tree
	 */
	void enterNodeContext(rulesParser.NodeContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#nodeContext}.
	 * @param ctx the parse tree
	 */
	void exitNodeContext(rulesParser.NodeContextContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#nonTerminals}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminals(rulesParser.NonTerminalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#nonTerminals}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminals(rulesParser.NonTerminalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#nonTerminal}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminal(rulesParser.NonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#nonTerminal}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminal(rulesParser.NonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#right}.
	 * @param ctx the parse tree
	 */
	void enterRight(rulesParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#right}.
	 * @param ctx the parse tree
	 */
	void exitRight(rulesParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void enterRuleName(rulesParser.RuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void exitRuleName(rulesParser.RuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#semantics}.
	 * @param ctx the parse tree
	 */
	void enterSemantics(rulesParser.SemanticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#semantics}.
	 * @param ctx the parse tree
	 */
	void exitSemantics(rulesParser.SemanticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#terminals}.
	 * @param ctx the parse tree
	 */
	void enterTerminals(rulesParser.TerminalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#terminals}.
	 * @param ctx the parse tree
	 */
	void exitTerminals(rulesParser.TerminalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(rulesParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(rulesParser.TerminalContext ctx);
}