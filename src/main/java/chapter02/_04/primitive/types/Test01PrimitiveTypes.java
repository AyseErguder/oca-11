package chapter02._04.primitive.types;

public class Test01PrimitiveTypes {

    // Java has eight built-in data types, referred to as the Java primitive types

    // The float and double types are used for floating-point (decimal) values.

    // A float requires the letter f following the number so Java knows it is a float

    /*
    The byte, short, int, and long types are used for numbers without
    decimal points. In mathematics, these are all referred to as integral
    values, but in Java, int and Integer refer to specific types
     */

    // All of the numeric types are signed in Java.

    /*
    For the exam, you should be aware that short and char are closely
    related, as both are stored as integral types with the same 16-bit length.

    short 16 bit signed
    char 16 bit unsigned

     */

    public static void main(String[] args) {

        int key = 'a';
        short bird ='d';
        char mammal = 83;

        System.out.println(key);
        System.out.println(bird);
        System.out.println(mammal);

        /*
        This usage is not without restriction, though. If you try to set a value
        outside the range of short or char, the compiler will report an error
         */

        System.out.println(Short.MAX_VALUE); // max value = 2^15 - 1
        System.out.println(Short.MIN_VALUE); // max value = 2^15
        System.out.println((int)Character.MAX_VALUE); // 2^16 -1
        System.out.println((int)Character.MIN_VALUE);

//        short reptile = 65535; // DOES NOT COMPILE
//        char fish = (short)-1; // DOES NOT COMPILE

        char fish = (char)-2;
        System.out.println((int)fish);

        char valid = 65535;
        valid++;
        System.out.println((int)valid);

        char module = (char)131074;
        System.out.println((int)module);
    }
}
