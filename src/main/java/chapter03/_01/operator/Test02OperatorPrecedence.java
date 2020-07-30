package chapter03._01.operator;

public class Test02OperatorPrecedence {

    public static void main(String[] args) {

        int height = 3;
        int length = 5;

        var perimeter = 2 * height + 2 * length;

        /*
        The multiplication operator (*) has a higher precedence than the addition
        operator (+), so the height and length are both multiplied by 2 before being
        added together. The assignment operator (=) has the lowest order of
        precedence, so the assignment to the perimeter variable is performed last.
         */

        /*
        If two operators have the same level of precedence, then Java guarantees leftto-right evaluation
         */
    }
}
