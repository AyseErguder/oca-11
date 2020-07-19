package chapter02._10.var;

public class Test08Var {
}

/*
 var is not a reserved word and allowed to be used as an identifier, it is considered a reserved type name
 */
 class Var {
    public void var() {
        var var = "var";
    }
    public void Var() {
        Var var = new Var();
    }
}

/*
 A reserved type name means it cannot be used to define a type, such as a class, interface, or enum.
 */
//class var { // DOES NOT COMPILE
//     var() {
//    }
//}