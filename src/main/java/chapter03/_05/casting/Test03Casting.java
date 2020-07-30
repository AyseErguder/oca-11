package chapter03._05.casting;

public class Test03Casting {
    public static void main(String[] args) {

        // int fish = 1.0; // DOES NOT COMPILE
        // short bird = 1921222; // DOES NOT COMPILE
        // int mammal = 9f; // DOES NOT COMPILE
        // long reptile = 192301398193810323; // DOES NOT COMPILE

        int trainer = (int)1.0;
        short ticketTaker = (short)1921222; // Stored as 20678
        int usher = (int)9f;
        long manager = 192301398193810323L;

        System.out.println(2147483647+1); //overflow
        //System.out.print((int)2147483648); //compile error

        System.out.println(-2147483648);
        // System.out.println(-2147483649); // compile error

        System.out.println(-2147483648 -1); // underflow
    }
}
