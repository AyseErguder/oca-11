package chapter03._05.casting;

import java.math.BigDecimal;

public class Test02Casting {

    public static void main(String[] args) {

        // float egg = 2.0 / 9; // DOES NOT COMPILE
        float egg2 = 2.0f / 9;
        float egg3 = (float) 2.0 / 9;
        float egg4 = (float) (2.0 / 9);

        System.out.println(egg2);
        System.out.println(egg3);
        System.out.println(egg4);

        //int tadpole = (int)5 * 2L; // DOES NOT COMPILE
        int tadpole2 = (int) (5 * 2L);

        // short frog = 3 - 2.0; // DOES NOT COMPILE
        short frog2 = (short) (3 - 2.0);



        System.out.println(Long.MAX_VALUE);
        long reptile = 1923013981938188888L;
    }
}
