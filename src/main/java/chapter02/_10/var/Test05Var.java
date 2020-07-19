package chapter02._10.var;

public class Test05Var {
    public void doesThisCompile(boolean check) {

        /**
         * Remember that for local variable type inference, the compiler looks only at the line with the declaration.
         * Since question and answer are not assigned values on the lines where they are
         * defined, the compiler does not know what to make of them.
         */
//        var question;   // compiler error
//        question = 1;
//        var question = 1;
//        var answer;
//        if (check) {
//            answer = 2;
//        } else {
//            answer = 3;
//        }
//        System.out.println(answer);
    }
}
