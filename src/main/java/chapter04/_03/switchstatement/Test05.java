package chapter04._03.switchstatement;

public class Test05 {

    /*
    * switch statements support numeric promotion that does
    not require an explicit cast.*/

    /*
    * The compiler can easily cast small from int to short at compiletime because the value 15 is small enough to fit inside a short.
    * This would not be permitted if small was not a compile-time constant. Likewise, it can
    convert the expression 1+2 from int to short at compile-time.
    On the other hand, 1_000_000 is too large to fit inside of short without an explicit cast*/

    public static void main(String[] args) {
        short size = 4;
        final int small = 15;
        final int big = 1_000_000;
        switch(size) {
            case small:
            case 1+2 :
     //       case big: // DOES NOT COMPILE
        }
    }
}
