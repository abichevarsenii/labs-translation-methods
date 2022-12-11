package lab3;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
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
            return visit(ctx);
        }
        return "";
    }

    public <T extends ParserRuleContext> String visitList(List<T> list, String separator) {
        return list.stream().map(this::visit).collect(Collectors.joining(separator));
    }

    @Override
    public String visitStart(HTMLHighlightingParser.StartContext ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText());
                } else {
                    res.append(visit(child) + " ");
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
     * Visit a parse tree produced by {@link HTMLHighlightingParser#typeVar}.
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
            if (ctx.PRIMITIVE_VALUE() != null) {
                System.out.println(ctx.PRIMITIVE_VALUE().getClass().toString());
                res.append(Tools.getClass(ctx.PRIMITIVE_VALUE(), "comments"));
            } else {
                for (ParseTree child : ctx.children) {
                    if (child instanceof TerminalNode) {
                        res.append(child.getText() + " ");
                    } else {
                        res.append(visit(child) + " ");
                    }
                }
            }
            ctx.val = res.toString();
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
            res.append(Tools.getClass(ctx.MODIFIER(), "keyword")).append(" ");
            res.append(Tools.getClass(visit(ctx.typeVar()), "simple")).append(" ");
            if (ctx.nameType().size() == 1) {
                res.append(Tools.getClass(visit(ctx.nameType(0)), "simple")).append(" ");
                res.append(Tools.getClass(checkVisit(ctx.ASSIGN(0)), "simple")).append(" ");
                res.append(checkVisit(ctx.value(0)));
                res.append(Tools.getClass(";", "keyword")).append(" ");
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
                res.append(Tools.getClass(";", "keyword")).append(" ");
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
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText() + " ");
                } else {
                    res.append(visit(child) + " ");
                }
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
                    res.append(child.getText() + " ");
                } else {
                    res.append(visit(child) + " ");
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
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText() + " ");
                } else {
                    res.append(visit(child) + " ");
                }
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
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
        //System.out.println(ctx.val);
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
                    res.append(child.getText() + " ");
                } else {
                    res.append(visit(child) + " ");
                }
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
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
                    res.append(child.getText() + " ");
                } else {
                    res.append(visit(child) + " ");
                }
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
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
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText() + " ");
                } else {
                    res.append(visit(child) + " ");
                }
            }
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
                    res.append(child.getText() + " ");
                } else {
                    res.append(visit(child) + " ");
                }
            }
            ctx.val = res.toString();
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
                    res.append(child.getText() + " ");
                } else {
                    res.append(visit(child) + " ");
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
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText() + " ");
                } else {
                    res.append(visit(child) + " ");
                }
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
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
                    res.append(child.getText() + " ");
                } else {
                    res.append(visit(child) + " ");
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
                    res.append(child.getText() + " ");
                } else {
                    res.append(visit(child) + " ");
                }
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }

    /**
     * Visit a parse tree produced by {@link HTMLHighlightingParser#implements}.
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
                    res.append(child.getText() + " ");
                } else {
                    res.append(visit(child) + " ");
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
     * Visit a parse tree produced by {@link HTMLHighlightingParser#class}.
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
            res.append(Tools.tab()).append(visitList(ctx.bodyClass(), Tools.nextLine() + Tools.tab())).append(" ");
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
                    res.append(child.getText() + " ");
                } else {
                    res.append(visit(child) + " ");
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
                    res.append(child.getText() + " ");
                } else {
                    res.append(visit(child) + " ");
                }
            }
            ctx.val = res.toString();
        }
        //System.out.println(ctx.val);
        return ctx.val;
    }


}
