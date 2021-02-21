package chapter04._03.switchstatement;

public class Test01 {

    public static void main(String[] args) {
        int dayOfWeek = 5;if(dayOfWeek == 0) System.out.print("Sunday");
        else if(dayOfWeek == 1)
        {
            System.out.print("Monday");
        }
        else if(dayOfWeek == 2) {
            System.out.print("Tuesday");
        } else if(dayOfWeek == 3)
            System.out.print("Wednesday");



        int month = 5;
//        switch month { // DOES NOT COMPILE
//            case 1: System.out.print("January");
//        }
//        switch (month) // DOES NOT COMPILE
//        case 1: System.out.print("January");
//        switch (month) {
//            case 1: 2: System.out.print("January"); // DOES NOT COMPILE
//        }
//        switch (month) {
//            case 1 || 2: System.out.print("January"); // DOES NOT COMPILE
//        }

/*The first switch statement does not compile because it is missing
parentheses around the switch variable. The second statement does not
compile because it is missing braces around the switch body. The third
statement does not compile because the case keyword is missing before the
2: label. Each case statement requires the keyword case, followed by a
value and a colon (:).
Finally, the last switch statement does not compile because 1 || 2 uses the
short-circuit boolean operator, which cannot be applied to numeric values.
A single bitwise operator (|) would have allowed the code to compile,
although the interpretation of this might not be what you expect. It would
then only match a value of month that is the bitwise result of 1 | 2, which
is 3, and would not match month having a value 1 or 2. You don’t need to
know bitwise arithmetic for the exam, but you do need to know proper
syntax for case statements*/
    }
}
