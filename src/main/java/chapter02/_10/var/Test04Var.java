package chapter02._10.var;

public class Test04Var {

    void test() {
        var apples = (short)10;
        apples = (byte)5;
        apples = 20;
        // apples = 1_000_000; // DOES NOT COMPILE
        // required type = short
        // provided type = int  , compiler error

        // short invalid = 1_000_000;

        /*
        The last line does not compile, as one million is well beyond the limits of short
         */
    }
}
