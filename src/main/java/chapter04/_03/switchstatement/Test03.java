package chapter04._03.switchstatement;

public class Test03 {

//    list of all data types supported by switch statements:
//    int and Integer
//    byte and Byte
//    short and Short
//    char and Character
//    String
//    enum values
//    var (if the type resolves to one of the preceding types)

    public static void main(String[] args) {
        int dayOfWeek = 5;
        switch(dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 4:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }



        var dayOfWeekvar = 5;
        switch(dayOfWeekvar) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}
