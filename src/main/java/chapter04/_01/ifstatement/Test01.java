package chapter04._01.ifstatement;

public class Test01 {

    public static void main(String[] args) {

        int ticketsTaken = 10;
        int patrons = 0;
        // Single statement
        patrons++;
        // Statement inside a block
        {
            patrons++;
        }

        // Single statement

        if (ticketsTaken > 1)
            patrons++;

        // Statement inside a block
        if (ticketsTaken > 1) {
            patrons++;
        }
    }
}
