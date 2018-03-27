package main;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Ekaterina Semenova on 17.03.2018.
 */
public class KeyWordsSet {
    private static final Set<String> keyWordsSet = new TreeSet<>();
     static {
        keyWordsSet.add("abstract");
        keyWordsSet.add("continue");
        keyWordsSet.add("for");
        keyWordsSet.add("new");
        keyWordsSet.add("switch");
        keyWordsSet.add("assert");
        keyWordsSet.add("default");
        keyWordsSet.add("goto");
        keyWordsSet.add("package");
        keyWordsSet.add("synchronized");
        keyWordsSet.add("boolean");
        keyWordsSet.add("do");
        keyWordsSet.add("private");
        keyWordsSet.add("if");
        keyWordsSet.add("this");
        keyWordsSet.add("break");
        keyWordsSet.add("double");
        keyWordsSet.add("implements");
        keyWordsSet.add("protected");
        keyWordsSet.add("throw");
        keyWordsSet.add("import");
        keyWordsSet.add("byte");
        keyWordsSet.add("else");
        keyWordsSet.add("throws");
        keyWordsSet.add("public");
        keyWordsSet.add("case");
        keyWordsSet.add("enum");
        keyWordsSet.add("instanceof");
        keyWordsSet.add("return");
        keyWordsSet.add("transient");
        keyWordsSet.add("extends");
        keyWordsSet.add("catch");
        keyWordsSet.add("int");
        keyWordsSet.add("short");
        keyWordsSet.add("try");
        keyWordsSet.add("final");
        keyWordsSet.add("interface");
        keyWordsSet.add("static");
        keyWordsSet.add("void");
        keyWordsSet.add("char");
        keyWordsSet.add("finally");
        keyWordsSet.add("long");
        keyWordsSet.add("strictfp");
        keyWordsSet.add("class");
        keyWordsSet.add("volatile");
        keyWordsSet.add("float");
        keyWordsSet.add("const");
        keyWordsSet.add("native");
        keyWordsSet.add("super");
        keyWordsSet.add("while");
        keyWordsSet.add("true");
        keyWordsSet.add("false");
        keyWordsSet.add("null");
    }
    public static Set<String> getKeyWordsSet(){
         return keyWordsSet;
    }
}
