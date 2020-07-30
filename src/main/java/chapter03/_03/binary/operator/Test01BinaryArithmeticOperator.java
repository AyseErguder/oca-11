package chapter03._03.binary.operator;

public class Test01BinaryArithmeticOperator
{
    public static void main(String[] args) {
        int price = 2 * 5 + 3 * 4 - 8;
        System.out.println(price);

        int price2 = 2 * ((5 + 3) * 4 - 8);

        System.out.println(price2);

        /**
         * When working with parentheses, you need to make sure they are always
         * valid and balanced.
         */
        // long pigeon = 1 + ((3 * 5) / 3; // DOES NOT COMPILE
        // int blueJay = (9 + 2) + 3) / (2 * 4; // DOES NOT COMPILE
        // short robin = 3 + [(4 * 2) + 4]; // DOES NOT COMPILE
    }

    /**
     * All of the arithmetic operators may be applied to any Java
     * primitives, with the exception of boolean. Furthermore, only the
     * addition operators + and += may be applied to String values, which
     * results in String concatenation
     */
}
