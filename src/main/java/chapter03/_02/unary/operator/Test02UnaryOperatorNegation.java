package chapter03._02.unary.operator;

public class Test02UnaryOperatorNegation {

    public static void main(String[] args) {

        /*
        The opeartor "+"
        Indicates a number is positive, although numbers are assumed
        to be positive in Java unless accompanied by a negative unary operator
         */

        /*
        The operator "-"
        Indicates a literal number is negative or negates an expression
         */
        double zooTemperature = +1.21;
        System.out.println(zooTemperature); // 1.21
        zooTemperature = -zooTemperature;
        System.out.println(zooTemperature); // -1.21
        zooTemperature = -(-zooTemperature);
        System.out.println(zooTemperature); // -1.21


        // int pelican = !5; // DOES NOT COMPILE
        // boolean penguin = -true; // DOES NOT COMPILE
        // boolean peacock = !0; // DOES NOT COMPILE
    }
}
