package chapter04._02.elsestatement;

public class Test02 {

    public static void main(String[] args) {
        int hourOfDay = 10;
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

        System.out.println("\n Test 2 \n");

        if (hourOfDay < 15) {
            System.out.println("Good Morning");
        } else if (hourOfDay < 11) {
            System.out.println("Good Afternoon");  // COMPILES BUT IS UNREACHABLE
        } else {
            System.out.println("Good Evening");
        }

/*
* If a value is less than 11, then it must be also less than 15 by definition.
Therefore, if the second branch in the example can be reached, the first
branch can also be reached. Since execution of each branch is mutually
exclusive in this example (that is, only one branch can be executed), then if
the first branch is executed, the second cannot be executed. Therefore, there
is no way the second branch will ever be executed, and the code is deemed
unreachable.*/
    }
}
