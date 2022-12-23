package lab3;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.lang.model.SourceVersion;

public class Tools {
    private static int tabLevel = 0;

    public static void resetTab() {
        tabLevel = 0;
    }

    public static void upTab() {
        tabLevel++;
    }

    public static void downTab() {
        tabLevel--;
    }

    public static String joinTerminals(List<TerminalNode> list) {
        return joinTerminals(list, " ");
    }

    public static String joinTerminals(List<TerminalNode> list, String separator) {
        if (list.isEmpty()) {
            return "";
        }
        return list.stream().map(ParseTree::getText).collect(Collectors.joining(separator));
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
        return tab(2);
    }

    public static String tab(int count) {
        return String.join("", Collections.nCopies(count * tabLevel, "&nbsp"));
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
