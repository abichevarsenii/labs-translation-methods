// Generated from C:/Users/Arsenii/labs-translation-methods/src/lab3\HTMLHighlighting.g4 by ANTLR 4.10.1
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
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#nameType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameType(HTMLHighlightingParser.NameTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#typeVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVar(HTMLHighlightingParser.TypeVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(HTMLHighlightingParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#declareVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareVar(HTMLHighlightingParser.DeclareVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#declareField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareField(HTMLHighlightingParser.DeclareFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#assignVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVar(HTMLHighlightingParser.AssignVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#callMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallMethod(HTMLHighlightingParser.CallMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(HTMLHighlightingParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(HTMLHighlightingParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#exeptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExeptions(HTMLHighlightingParser.ExeptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(HTMLHighlightingParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#bodyFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyFunction(HTMLHighlightingParser.BodyFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#returnFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunction(HTMLHighlightingParser.ReturnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(HTMLHighlightingParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(HTMLHighlightingParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#castStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastStatement(HTMLHighlightingParser.CastStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#implements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplements(HTMLHighlightingParser.ImplementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#exstends}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExstends(HTMLHighlightingParser.ExstendsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(HTMLHighlightingParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(HTMLHighlightingParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLHighlightingParser#bodyClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyClass(HTMLHighlightingParser.BodyClassContext ctx);
}