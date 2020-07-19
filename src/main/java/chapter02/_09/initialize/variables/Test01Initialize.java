package chapter02._09.initialize.variables;

public class Test01Initialize {

    /**
     * A local variable is a variable defined within a constructor, method, or
     * initializer block.
     */

    public int notValid() {
        int y = 10;
        int x; // uninitialized
        // int reply = x + y; // DOES NOT COMPILE
        int reply = y + 1;
        return reply;
    }

    public int valid() {
        int y = 10;
        int x; // x is declared here
        x = 3; // and initialized here
        int reply = x + y;
        return reply;

    }

    public void findAnswer(boolean check) {
        int answer;
        int otherAnswer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        // System.out.println(onlyOneBranch); // DOES NOT COMPILE
        // System.out.println(otherAnswer); // compile error.
    }

}
