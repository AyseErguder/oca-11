package chapter02._03.initializer.block;

public class Bird {

    public static void main(String[] args) {
        System.out.println("hello main");

        Bird bird = new Bird();
    }

    {
        /**
         * The code between the braces (sometimes called “inside the braces”) is called a code block
         * These are called instance initializers
         */
        System.out.println("initializer block");
    }
    /**
     * There are four code blocks in this example: a class definition, a method
     * declaration, an inner block, and an instance initializer
     */
}
