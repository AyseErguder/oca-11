package chapter03._04.numeric.promotion;

public class Test01NumericPromotion {
    public static void main(String[] args) {
//        1. Numeric Promotion Rules If two values have different data
//        types, Java will automatically promote one of the values to the larger
//        of the two data types.
//        2. If one of the values is integral and the other is floating-point, Java will
//        automatically promote the integral value to the floating-point value’s
//        data type.
//        3. Smaller data types, namely, byte, short, and char, are first promoted
//        to int any time they’re used with a Java binary arithmetic operator,
//        even if neither of the operands is int.
//        4. After all promotion has occurred and the operands have the same data
//        type, the resulting value will have the same data type as its promoted
//        operands.

        int x = 1;
        long y = 33;
        var z = x * y; // long

        double x2 = 39.21;
        // float y2 = 2.1; // Compile error
        float y2 = 2.1f;
        var z2 = x2 + y2;

        short x3 = 10;
        short y3 = 3;
        var z3 = x3 * y3; // int

        short w4 = 14;
        float x4 = 13;
        double y4 = 30;
        var z4 = w4 * x4 / y4; //double
    }
}
