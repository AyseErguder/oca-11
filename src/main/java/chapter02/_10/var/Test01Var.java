package chapter02._10.var;

public class Test01Var {
    /**
     * Starting in Java 10, you have the option of using the keyword var instead of
     * the type for local variables under certain conditions
     */

    public void whatTypeAmI() {
        var name = "Hello";
        var size = 7;
    }
    // The formal name of this feature is local variable type inference
}
