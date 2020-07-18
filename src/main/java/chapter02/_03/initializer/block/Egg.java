package chapter02._03.initializer.block;

public class Egg {

    // The constructor runs after all fields and instance initializer blocks have run.
    public Egg() {
        number = 5;
    }

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }


    // Fields and instance initializer blocks are run in the order in which they appear in the file
    {
        number = 4;
        // int number2 = number + 10; // compile error
        // System.out.println(number); // compile error
    }

    {
        number = 6;
    }

    private int number = 3;

}
