package chapter03._02.unary.operator;

public class Test01UnaryOperatorLogicalComplement {

    /*
    The logical complement operator (!) flips the value of a boolean expression.
    For example, if the value is true, it will be converted to false, and vice versa
     */

    public static void main(String[] args) {

        boolean isAnimalAsleep = false;
        System.out.println(isAnimalAsleep); // false
        isAnimalAsleep = !isAnimalAsleep;
        System.out.println(isAnimalAsleep); // true

    }
}
