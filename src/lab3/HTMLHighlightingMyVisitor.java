package lab3;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class HTMLHighlightingMyVisitor extends HTMLHighlightingBaseVisitor<String> {

    public String checkVisit(ParserRuleContext ctx) {
        if (ctx != null) {
            return visit(ctx);
        }
        return "";
    }

    public String checkVisit(TerminalNode ctx) {
        if (ctx != null) {
            return ctx.getText();
        }
        return "";
    }



    @Override
    public String visitCaseStatement(HTMLHighlightingParser.CaseStatementContext ctx) {
        //caseStatement returns [String val] : CASE value ':' bodyFunction* (BREAK ';')?;
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            res.append(Tools.getClass(ctx.CASE(), "keyword")).append(" ");
            res.append(visit(ctx.value())).append(" ");
            res.append(Tools.getClass(":", "keyword")).append(" ");
            Tools.upTab();
            res.append(Tools.nextLine()).append(Tools.tab());
            res.append(visitList(ctx.bodyFunction(),Tools.nextLine() + Tools.tab()));
            if (ctx.BREAK() != null) {
                res.append(Tools.nextLine()).append(Tools.tab());
                res.append(Tools.getClass(ctx.BREAK(), "keyword"));
                res.append(Tools.getClass(";", "keyword")).append(" ");
            }
            Tools.downTab();
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    @Override
    public String visitDefaultStatement(HTMLHighlightingParser.DefaultStatementContext ctx) {
        //defaultStatement returns [String val] : DEFAULT ':' bodyFunction*;
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            res.append(Tools.getClass(ctx.DEFAULT(), "keyword")).append(" ");
            res.append(Tools.getClass(":", "keyword")).append(" ");
            Tools.upTab();
            res.append(Tools.nextLine()).append(Tools.tab());
            res.append(visitList(ctx.bodyFunction(),Tools.nextLine() + Tools.tab()));
            Tools.downTab();
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    @Override
    public String visitSwitchStatement(HTMLHighlightingParser.SwitchStatementContext ctx) {
        //switchStatement returns [String val] : SWITCH '(' callMethod ')' '{' caseStatement* defaultStatement? '}';
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            res.append(Tools.getClass(ctx.SWITCH(), "keyword")).append(" ");
            res.append(Tools.getClass("(", "simple")).append(" ");
            res.append(visit(ctx.callMethod())).append(" ");
            res.append(Tools.getClass(")", "simple")).append(" ");
            res.append(Tools.getClass("{", "simple")).append(" ");
            Tools.upTab();
            res.append(Tools.nextLine()).append(Tools.tab());
            res.append(visitList(ctx.caseStatement(),Tools.nextLine() + Tools.tab()));
            res.append(Tools.nextLine()).append(Tools.tab());
            res.append(checkVisit(ctx.defaultStatement()));
            Tools.downTab();
            res.append(Tools.nextLine()).append(Tools.tab());
            res.append(Tools.getClass("}", "simple")).append(" ");
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    public <T extends ParserRuleContext> String visitList(List<T> list, String separator) {
        return list.stream().map(this::visit).collect(Collectors.joining(separator));
    }

    @Override public String visitTerm(HTMLHighlightingParser.TermContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText()).append(" ");
                } else {
                    res.append(visit(child)).append(" ");
                }
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    @Override
    public String visitForStatement(HTMLHighlightingParser.ForStatementContext ctx) {
        //forStatement returns [String val] : (FOR'(' (declareVar | assignVar) ';' (callMethod|term) ';' (callMethod|term) ')') ('{' bodyFunction* '}' | bodyFunction?);
        StringBuilder res = new StringBuilder();

        if (ctx.children != null) {
            List<ParseTree> children = ctx.children.stream().filter(Objects::nonNull).collect(Collectors.toList());
            res.append(Tools.getClass(ctx.FOR(), "keyword")).append(" ");
            res.append(Tools.getClass("(", "simple")).append(" ");
            res.append(visit(children.get(2))).append(" ");
            res.append(Tools.getClass(";", "keyword"));
            res.append(visit(children.get(4))).append(" ");
            res.append(Tools.getClass(";", "keyword"));
            res.append(visit(children.get(6))).append(" ");
            res.append(Tools.getClass(")", "simple"));
            res.append(Tools.getClass("{", "simple"));
            Tools.upTab();
            res.append(Tools.nextLine());
            res.append(Tools.tab()).append(visitList(ctx.bodyFunction(), Tools.nextLine() + Tools.tab()));
            Tools.downTab();
            res.append(Tools.nextLine()).append(Tools.tab());
            res.append(Tools.getClass("}", "simple"));
            ctx.val = res.toString();
        }
        return ctx.val;
    }

    @Override
    public String visitPrimitiveType(HTMLHighlightingParser.PrimitiveTypeContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText());
                } else {
                    res.append(visit(child));
                }
            }
            ctx.val = Tools.getClass(res.toString(),"keyword") ;
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    @Override
    public String visitPrimitiveValue(HTMLHighlightingParser.PrimitiveValueContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            String text = ctx.children.get(0).getText();
            if (ctx.CHAR() != null || ctx.STRING() != null){
                res.append(Tools.getClass(text,"comments"));
            }
            if (ctx.INT() != null || ctx.FLOAT() != null){
                res.append(Tools.getClass(text,"numbers"));
            }
            if (ctx.NULL() != null || ctx.BOOLEAN() != null){
                res.append(Tools.getClass(text,"keyword"));
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    @Override
    public String visitStart(HTMLHighlightingParser.StartContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText());
                } else {
                    res.append(visit(child)).append(" ");
                }
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#nameType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitNameType(HTMLHighlightingParser.NameTypeContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText());
                } else {
                    res.append(visit(child));
                }
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitTypeVar(HTMLHighlightingParser.TypeVarContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText());
                } else {
                    res.append(visit(child));
                }
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#value}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitValue(HTMLHighlightingParser.ValueContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            if (ctx.primitiveValue() != null) {
                res.append(visit(ctx.primitiveValue()));
            } else if (ctx.NEW() != null){
                res.append(Tools.getClass(ctx.NEW(),"keyword")).append(" ");
                res.append(checkVisit(ctx.typeVar())).append(" ");
                res.append(checkVisit(ctx.value(0))).append(" ");
            } else {
                for (ParseTree child : ctx.children) {
                    if (child instanceof TerminalNode) {
                        res.append(child.getText()).append(" ");
                    } else {
                        res.append(visit(child)).append(" ");
                    }
                }
            }
            ctx.val = Tools.getClass(res.toString(),"simple");
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }


    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#declareVar}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitDeclareVar(HTMLHighlightingParser.DeclareVarContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            res.append(Tools.getClass(visit(ctx.typeVar()), "simple")).append(" ");
            if (ctx.nameType().size() == 1) {
                res.append(Tools.getClass(visit(ctx.nameType(0)), "simple")).append(" ");
                res.append(Tools.getClass(checkVisit(ctx.ASSIGN(0)), "simple")).append(" ");
                res.append(checkVisit(ctx.value(0)));
                //res.append(Tools.getClass(";", "keyword")).append(" ");
            } else {
                for (int i = 0; i < ctx.nameType().size()-1; i++) {
                    res.append(Tools.getClass(visit(ctx.nameType(i)), "simple")).append(" ");
                    res.append(Tools.getClass(ctx.ASSIGN(i), "simple")).append(" ");
                    res.append(checkVisit(ctx.value(i)));
                    res.append(Tools.getClass(",", "keyword")).append(" ");
                }
                res.append(Tools.getClass(visit(ctx.nameType(ctx.nameType().size()-1)), "simple")).append(" ");
                res.append(Tools.getClass(ctx.ASSIGN(ctx.nameType().size()-1), "simple")).append(" ");
                res.append(checkVisit(ctx.value(ctx.nameType().size()-1)));
                //res.append(Tools.getClass(";", "keyword")).append(" ");
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#declareField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitDeclareField(HTMLHighlightingParser.DeclareFieldContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            res.append(visitList(ctx.annotation(), " ")).append(" ");
            res.append(Tools.getClass(ctx.MODIFIER(), "keyword")).append(" ");
            res.append(Tools.getClass(visit(ctx.typeVar()), "simple")).append(" ");
            if (ctx.nameType().size() == 1) {
                res.append(Tools.getClass(visit(ctx.nameType(0)), "fields")).append(" ");
                res.append(Tools.getClass(checkVisit(ctx.ASSIGN(0)) , "simple")).append(" ");
                res.append(checkVisit(ctx.value(0)));
                res.append(Tools.getClass(";", "keyword")).append(" ");
            } else {
                for (int i = 0; i < ctx.nameType().size()-1; i++) {
                    res.append(Tools.getClass(visit(ctx.nameType(i)), "fields")).append(" ");
                    res.append(Tools.getClass(checkVisit(ctx.ASSIGN(i)), "simple")).append(" ");
                    res.append(checkVisit(ctx.value(i)));
                    res.append(Tools.getClass(",", "keyword")).append(" ");
                }
                res.append(Tools.getClass(visit(ctx.nameType(ctx.nameType().size()-1)), "fields")).append(" ");
                res.append(Tools.getClass(ctx.ASSIGN(ctx.nameType().size()-1), "simple")).append(" ");
                res.append(checkVisit(ctx.value(ctx.nameType().size()-1)));
                res.append(Tools.getClass(";", "keyword")).append(" ");
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#assignVar}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitAssignVar(HTMLHighlightingParser.AssignVarContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText()).append(" ");
                } else {
                    res.append(visit(child)).append(" ");
                }
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#callMethod}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitCallMethod(HTMLHighlightingParser.CallMethodContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            res.append(visit(ctx.nameType(0)));
            res.append(Tools.getClass("(", "simple"));
            if (ctx.children.size() > 3) {
                for (int i = 2; i < ctx.children.size()-2; i+=2) {
                    res.append(visit(ctx.children.get(i)));
                    res.append(Tools.getClass(", ", "keyword"));
                }
                res.append(visit(ctx.children.get(ctx.children.size()-2)));
            }
            res.append(Tools.getClass(")", "simple"));
            ctx.val = res.toString();
        }
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#annotation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitAnnotation(HTMLHighlightingParser.AnnotationContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText());
                } else {
                    res.append(visit(child));
                }
            }
            ctx.val = Tools.getClass(res.toString(), "annotation") + Tools.nextLine();
        }
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#arg}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitArg(HTMLHighlightingParser.ArgContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText()).append(" ");
                } else {
                    res.append(visit(child)).append(" ");
                }
            }
            ctx.val = res.toString();
        }
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#exeptions}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitExeptions(HTMLHighlightingParser.ExeptionsContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText()).append(" ");
                } else {
                    res.append(visit(child)).append(" ");
                }
            }
            ctx.val = res.toString();
        }
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#function}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitFunction(HTMLHighlightingParser.FunctionContext ctx) {
        //annotation* MODIFIER* typeVar nameType'(' (arg(','arg)*)? ')' exeptions? '{' bodyFunction? returnFunction? '}';
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            res.append(Tools.nextLine()).append(Tools.tab());
            res.append(visitList(ctx.annotation(), " ") );
            res.append(Tools.getClass(ctx.MODIFIER(), "keyword") ).append(" ");
            res.append(Tools.getClass(visit(ctx.nameType()), "function"));
            res.append(Tools.getClass("(", "simple"));
            if (ctx.arg().size() > 0) {
                for (int i = 0; i < ctx.arg().size()-1; i++) {
                    res.append(Tools.getClass(visit(ctx.arg(i)),"simple") );
                    res.append(Tools.getClass(",", "keyword")).append(" ");
                }
                res.append(Tools.getClass(visit(ctx.arg(ctx.arg().size()-1)),"simple"));
            }
            res.append(Tools.getClass(")", "simple")).append(" ");
            res.append(Tools.getClass(checkVisit(ctx.exeptions()), "simple"));
            res.append(Tools.getClass("{", "simple"));
            Tools.upTab();
            res.append(Tools.nextLine()).append(Tools.tab()).append(Tools.tab());
            res.append(Tools.getClass(visitList(ctx.bodyFunction(), Tools.nextLine() + Tools.tab()), "simple"));
            res.append(Tools.nextLine());
            res.append(Tools.tab()).append(Tools.tab()).append(Tools.getClass(checkVisit(ctx.returnFunction()), "simple"));
            res.append(Tools.nextLine());
            Tools.downTab();
            res.append(Tools.tab()).append(Tools.getClass("}", "simple"));
            res.append(Tools.getClass(";", "keyword"));
            res.append(Tools.nextLine());
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#bodyFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitBodyFunction(HTMLHighlightingParser.BodyFunctionContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                     res.append(Tools.getClass(child.getText(),"keyword") );
                } else {
                    res.append(visit(child));
                }
            }
            ctx.val = Tools.getClass(res.toString(),"simple") ;
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#returnFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitReturnFunction(HTMLHighlightingParser.ReturnFunctionContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(Tools.getClass(child.getText(),"keyword") ).append(" ");
                } else {
                    res.append(visit(child)).append(" ");
                }
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#ifStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitIfStatement(HTMLHighlightingParser.IfStatementContext ctx) {
        //ifStatement returns [String val] : IF '(' (callMethod|term) ')' '{' bodyFunction '}' elseStatement? | IF'('callMethod')' bodyFunction elseStatement?;
        StringBuilder res = new StringBuilder();
        res.append(Tools.getClass(ctx.IF(), "keyword")).append(" ");
        res.append(Tools.getClass("(", "simple")).append(" ");
        res.append(Tools.getClass(visit(ctx.getChild(2)), "simple"));
        res.append(Tools.getClass(")", "simple")).append(" ");
        res.append(Tools.getClass("{", "simple"));
        Tools.upTab();
        res.append(Tools.nextLine());
        res.append(Tools.tab()).append(Tools.getClass(visit(ctx.getChild(5)), "simple"));
        res.append(Tools.nextLine());
        Tools.downTab();
        res.append(Tools.tab()).append(Tools.getClass("}", "simple")).append(" ");
        //res.append(Tools.nextLine());
        res.append(Tools.getClass(checkVisit(ctx.elseStatement()), "simple"));
        ctx.val = res.toString();
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#elseStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitElseStatement(HTMLHighlightingParser.ElseStatementContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText()).append(" ");
                } else {
                    res.append(visit(child)).append(" ");
                }
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#castStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitCastStatement(HTMLHighlightingParser.CastStatementContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText()).append(" ");
                } else {
                    res.append(visit(child)).append(" ");
                }
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitImplements(HTMLHighlightingParser.ImplementsContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText()).append(" ");
                } else {
                    res.append(visit(child)).append(" ");
                }
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#exstends}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitExstends(HTMLHighlightingParser.ExstendsContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            res.append(Tools.getClass(ctx.EXTENDS(), "keyword")).append(" ");
            res.append(Tools.getClass(visit(ctx.nameType()), "simple"));
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitClass(HTMLHighlightingParser.ClassContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            res.append(checkVisit(ctx.annotation())).append(" ");
            res.append(Tools.getClass(ctx.MODIFIER(), "keyword")).append(" ");
            res.append(Tools.getClass(ctx.CLASS(), "keyword")).append(" ");
            res.append(Tools.getClass(checkVisit(ctx.nameType()), "simple")).append(" ");
            res.append(checkVisit(ctx.exstends())).append(" ");
            res.append(checkVisit(ctx.implements_())).append(" ");
            res.append(Tools.getClass("{", "simple")).append(Tools.nextLine());
            Tools.upTab();
            res.append(Tools.tab()).append(visitList(ctx.bodyClass(), Tools.nextLine() + Tools.tab()));
            Tools.downTab();
            res.append(Tools.nextLine()).append(Tools.getClass("}", "simple")).append(" ");
        }
        ctx.val = res.toString();
        //System.out.println(ctx.val);
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#constructor}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitConstructor(HTMLHighlightingParser.ConstructorContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText()).append(" ");
                } else {
                    res.append(visit(child)).append(" ");
                }
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#bodyClass}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public String visitBodyClass(HTMLHighlightingParser.BodyClassContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText());
                } else {
                    res.append(visit(child));
                }
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }


}
