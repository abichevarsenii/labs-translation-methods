// Generated from C:/Users/Arsenii/labs-translation-methods/src/lab3\HTMLHighlighting.g4 by ANTLR 4.10.1
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
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#nameType}.
	 * @param ctx the parse tree
	 */
	void enterNameType(HTMLHighlightingParser.NameTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#nameType}.
	 * @param ctx the parse tree
	 */
	void exitNameType(HTMLHighlightingParser.NameTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#typeVar}.
	 * @param ctx the parse tree
	 */
	void enterTypeVar(HTMLHighlightingParser.TypeVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#typeVar}.
	 * @param ctx the parse tree
	 */
	void exitTypeVar(HTMLHighlightingParser.TypeVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(HTMLHighlightingParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(HTMLHighlightingParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#declareVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVar(HTMLHighlightingParser.DeclareVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#declareVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVar(HTMLHighlightingParser.DeclareVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#declareField}.
	 * @param ctx the parse tree
	 */
	void enterDeclareField(HTMLHighlightingParser.DeclareFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#declareField}.
	 * @param ctx the parse tree
	 */
	void exitDeclareField(HTMLHighlightingParser.DeclareFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(HTMLHighlightingParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(HTMLHighlightingParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#callMethod}.
	 * @param ctx the parse tree
	 */
	void enterCallMethod(HTMLHighlightingParser.CallMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#callMethod}.
	 * @param ctx the parse tree
	 */
	void exitCallMethod(HTMLHighlightingParser.CallMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(HTMLHighlightingParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(HTMLHighlightingParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(HTMLHighlightingParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(HTMLHighlightingParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#exeptions}.
	 * @param ctx the parse tree
	 */
	void enterExeptions(HTMLHighlightingParser.ExeptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#exeptions}.
	 * @param ctx the parse tree
	 */
	void exitExeptions(HTMLHighlightingParser.ExeptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(HTMLHighlightingParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(HTMLHighlightingParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#bodyFunction}.
	 * @param ctx the parse tree
	 */
	void enterBodyFunction(HTMLHighlightingParser.BodyFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#bodyFunction}.
	 * @param ctx the parse tree
	 */
	void exitBodyFunction(HTMLHighlightingParser.BodyFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#returnFunction}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunction(HTMLHighlightingParser.ReturnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#returnFunction}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunction(HTMLHighlightingParser.ReturnFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(HTMLHighlightingParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(HTMLHighlightingParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(HTMLHighlightingParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(HTMLHighlightingParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#castStatement}.
	 * @param ctx the parse tree
	 */
	void enterCastStatement(HTMLHighlightingParser.CastStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#castStatement}.
	 * @param ctx the parse tree
	 */
	void exitCastStatement(HTMLHighlightingParser.CastStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#implements}.
	 * @param ctx the parse tree
	 */
	void enterImplements(HTMLHighlightingParser.ImplementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#implements}.
	 * @param ctx the parse tree
	 */
	void exitImplements(HTMLHighlightingParser.ImplementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#exstends}.
	 * @param ctx the parse tree
	 */
	void enterExstends(HTMLHighlightingParser.ExstendsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#exstends}.
	 * @param ctx the parse tree
	 */
	void exitExstends(HTMLHighlightingParser.ExstendsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(HTMLHighlightingParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(HTMLHighlightingParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(HTMLHighlightingParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(HTMLHighlightingParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLHighlightingParser#bodyClass}.
	 * @param ctx the parse tree
	 */
	void enterBodyClass(HTMLHighlightingParser.BodyClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLHighlightingParser#bodyClass}.
	 * @param ctx the parse tree
	 */
	void exitBodyClass(HTMLHighlightingParser.BodyClassContext ctx);
}