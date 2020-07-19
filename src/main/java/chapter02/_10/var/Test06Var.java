package chapter02._10.var;

public class Test06Var {
    public void twoTypes() {

        /*
         All the types declared on a single line must be the same type and share the same declaration
         */
        //int a1, int v1 = 3; // compile error
        // int a2 ,  a3=10 , a4 ;

        // int a, var b = 3; // DOES NOT COMPILE
        int a ; var b =3;
        // var n = null; // DOES NOT COMPILE
        // The compiler is being asked to infer the type of null.
        /*
         The designers of Java decided it would be better not to allow var
         for null than to have to guess at intent.
         */

        var n2 = (Integer) null; // VALID !OK

        // In other words, Java does not allow var in multiple variable declarations
        //var a5 = 2, b5 = 3; // DOES NOT COMPILE
        int a10=2 , b10=3;

        /*
        While a var cannot be initialized with a null value without a type, it
        can be assigned a null value after it is declared, provided that the
        underlying data type of the var is an object
         */

        var n = "myData";
        n = null; // the type is String

        var m = 4; // the type is int
        // m = null; // DOES NOT COMPILE
    }

}
