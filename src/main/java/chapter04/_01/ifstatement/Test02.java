package chapter04._01.ifstatement;

public class Test02 {

    public static void main(String[] args) {

        int hourOfDay=10;
        if(hourOfDay < 11)
            System.out.println("Good Morning");

        int morningGreetingCount = 0;
        if(hourOfDay < 11) {
            System.out.println("Good Morning");
            morningGreetingCount++;
        }

        if(hourOfDay < 11)
            System.out.println("Good Morning");
        morningGreetingCount++;

    }
}
