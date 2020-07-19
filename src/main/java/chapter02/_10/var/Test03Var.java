package chapter02._10.var;

public class Test03Var {

    public void reassignment() {
        var number = 7;
        number = 4;
        // number = "five"; // DOES NOT COMPILE
        // It is equivalent to typing this
        // int number = "five";
    }
}
