package lab3;

import java.util.Collections;

public class Tools {


    public static String nextLine(int count) {
        return String.join("", Collections.nCopies(count, nextLine()));
    }

    public static String nextLine() {
        return "<br>";
    }

    public static String getPackage(String name) {
        return getClass("package", "var") + " " + getClass(name, "simple") + getClass(";", "var") + nextLine();
    }

    public static String getImport(String name) {
        return getClass("import", "var") + " " + getClass(name, "simple") + getClass(";", "var") + nextLine();
    }

    public static String getClass(String text, String name) {
        return "<p class=\" " + name + "\">" + text + "</p>";
    }
}
