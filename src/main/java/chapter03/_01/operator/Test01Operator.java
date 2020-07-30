package chapter03._01.operator;

public class Test01Operator {
    /*
    In general, three flavors of operators are available in Java: unary, binary, and ternary.
     */

    public static void main(String[] args) {
        int cookies = 4;
        double reward = 3 + 2 * --cookies;
        System.out.print("Zoo animal receives: "+reward+" reward points");
    }
}
