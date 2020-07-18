package chapter02._08.declaring.multiple.variables;

public class Test01DeclaringMultipleVariables {

    void sandFence() {
        String s1, s2;
        String s3 = "yes", s4 = "no";
    }

    void paintFence() {
        int i1, i2, i3 = 0;

        System.out.println(i3);
        // System.out.println(i1); // compile error. i1 is not initialized.
        // System.out.println(i2); // compile error. i2 is not initialized.
    }

    // int num, String value; // DOES NOT COMPILE
    /*
    This code doesn’t compile because it tries to declare multiple variables of
    different types in the same statement.
     */

    /*
    Legal, valid, and compiles are all synonyms in the Java exam
    world. We try to use all the terminology you could encounter on the exam.
     */

}
