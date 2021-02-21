package chapter04._03.switchstatement;

public class Test04AcceptableCaseStatements {

    /* First off, the values in each case statement must be compile-time constant
values of the same data type as the switch value. This means you can use
only literals, enum constants, or final constant variables of the same data
type. By final constant, we mean that the variable must be marked with the
final modifier and initialized with a literal value in the same expression in
which it is declared.*/

    final int getCookies() { return 4; }

    void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();

        switch (numberOfAnimals) {
            case bananas:
//            case apples: // DOES NOT COMPILES
//            case getCookies(): // DOES NOT COMPILE
//            case cookies : // DOES NOT COMPILE
            case 3 * 5 :
        }
    }


    private int getSortOrder(String firstName, final String
            lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch(firstName) {
            case "Test":
                return 52;
//            case middleName: // DOES NOT COMPILE
//                id = 5;
//                break;
            case suffix:
                id = 0;
                break;
//            case lastName: // DOES NOT COMPILE
//                id = 8;
//                break;
//            case 5: // DOES NOT COMPILE
//                id = 7;
//                break;
//            case 'J': // DOES NOT COMPILE
//                id = 10;
//                break;
//            case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
//                id=15;
//                break;
        }
        return id;
    }
}
