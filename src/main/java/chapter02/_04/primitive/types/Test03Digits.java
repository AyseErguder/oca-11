package chapter02._04.primitive.types;

public class Test03Digits {

    // Octal ( 0 - 7 )
    // 0

    // Hexadecimal( 0 - F/f )
    // 0x OX

    // Binary ( 0 - 1 )
    // 0b 0B

    public static void main(String[] args) {

        // A a = 10
        // B b = 11
        // C c = 12
        // D d = 13
        // E e = 14
        // F f = 15

        int octal = 017; // 15
        // int octalInvalid = 018; // Compile error

        int hexa = 0X11F; // 287

        int binary = 0b1111;
        // int invalidBinary = 0B1112; // compile error

        System.out.println(octal);
        System.out.println(hexa);
        System.out.println(binary);
    }

}
