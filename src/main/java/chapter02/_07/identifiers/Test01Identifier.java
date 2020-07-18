package chapter02._07.identifiers;

public class Test01Identifier {

    // Identifiers must begin with a letter, a $ symbol, or a _ symbol.
    // Identifiers can include numbers but not start with them.
    // Since Java 9, a single underscore _ is not allowed as an identifier.
    /*
    You cannot use the same name as a Java reserved word. A reserved
    word is special word that Java has held aside so that you are not
    allowed to use it. Remember that Java is case sensitive, so you can use
    versions of the keywords that only differ in case
     */

    long okidentifier;
    float $OK2Identifier;
    boolean _alsoOK1d3ntifi3r;
    char __SStillOkbutKnotsonice$;

    // int 3DPointClass; // identifiers cannot begin with a number
    // byte hollywood@vine; // @ is not a letter, digit, $ or _
    // String *$coffee; // * is not a letter, digit, $ or _
    // double public; // public is a reserved word
    // short _; // a single underscore is not allowed
}
