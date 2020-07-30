package chapter03._05.casting;

public class Test04Casting {

    public static void main(String[] args) {
        short mouse = 10;
        short hamster = 3;
        // short capybara = mouse * hamster; // DOES NOT COMPILE

        short mouse2 = 10;
        short hamster2 = 3;
        short capybara2 = (short)(mouse2 * hamster2);


        short mouse3 = 10;
        short hamster3 = 3;
        // short capybara3 = (short)mouse3 * hamster3; // DOES NOT COMPILE
        // short gerbil = 1 + (short)(mouse * hamster); // DOES NOT COMPILE
    }
}
