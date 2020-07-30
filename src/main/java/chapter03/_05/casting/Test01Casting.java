package chapter03._05.casting;

public class Test01Casting {
    /*
     Casting is a unary operation where one data type is explicitly interpreted as another data type.
     */
    public static void main(String[] args) {

        int fur = (int)5;
        int hair = (short) 2;
        String type = (String) "Bird";
        short tail = (short)(4 + 10);

       // long feathers = 10(long); // DOES NOT COMPILE

        short x = 10;
        short x2 = (short)10;

        Short x3 = 10;

        Integer i = 10; // int -> Integer Autoboxing
        Integer i2 = Integer.valueOf(10); // int -> Integer boxing

        int i3 = i; // Integer -> int Autounboxing
        int i4 = i.intValue(); // Integer-> int unboxing


    }
}
