package lab3;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.lang.model.SourceVersion;

public class Tools {

    public static String WS = " ";
    public static String TAB = "\t";
    public static String joinTerminals(List<TerminalNode> list) {
        return joinTerminals(list, " ");
    }
    public static String joinTerminals(List<TerminalNode> list, String separator) {
        if (list.isEmpty()) {
            return "";
        }
        return list.stream().map(ParseTree::getText).collect(Collectors.joining(separator));
    }

    public static <T extends HTMLHighlightingParser.ConstructorContext> void  processed(T ctx) {
        StringBuilder res = new StringBuilder();
        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                if (child instanceof TerminalNode) {
                    res.append(child.getText());
                } else {
                    //res.append(((Tools.IValable) child).val);
                }
            }
            ctx.val = res.toString();
        }
    }

    public static boolean isNotReservedWord(String s) {
        return !SourceVersion.isKeyword(s);
    }

    public static String nextLine(int count) {
        return String.join("", Collections.nCopies(count, nextLine()));
    }

    public static String nextLine() {
        return "<br>";
    }

    public static String tab() {
        return tab(4);
    }
    public static String tab(int count) {
        return String.join("", Collections.nCopies(count, "&nbsp"));
    }

    public static String getPackage(String name) {
        return getClass("package", "var") + " " + getClass(name, "simple") + getClass(";", "var") + nextLine();
    }

    public static String getImport(String name) {
        return getClass("import", "var") + " " + getClass(name, "simple") + getClass(";", "var") + nextLine();
    }

    public static String getClass(List<TerminalNode> list, String type) {
        return getClass(joinTerminals(list), type);
    }

    public static String getClass(TerminalNode terminalNode, String type) {
        return getClass(terminalNode.getText(), type);
    }

    public static String getClass(String text, String name) {
        return "<div class=\" " + name + "\">" + text + "</div>";
    }
}
