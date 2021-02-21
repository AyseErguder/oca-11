package chapter04._02.elsestatement;

public class Test01 {
    public static void main(String[] args) {
        int hourOfDay=10;
        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        }
        if(hourOfDay >= 11) {
            System.out.println("Good Afternoon");
        }

        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Afternoon");
        }

    }
}
