package chapter02._03.initializer.block;

public class Chick {

    /**
     * Order matters for the fields and blocks of code. You can’t refer to a variable
     * before it has been defined:
     */
    // { System.out.println(name); } // DOES NOT COMPILE

    private String name = "Fluffy";

    /**
     *  Fields and instance initializer blocks are run in the order in which they appear in the file.
     */

    /**
     * The constructor runs after all fields and instance initializer blocks have run.
     */
    {
        System.out.println(name);
        System.out.println("setting field");
    }

    {
        System.out.println(name);
        System.out.println("setting field - 2");
    }


    public Chick() {
        System.out.println(name);
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}
