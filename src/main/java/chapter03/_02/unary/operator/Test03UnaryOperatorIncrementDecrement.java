package chapter03._02.unary.operator;

public class Test03UnaryOperatorIncrementDecrement {

    public static void main(String[] args) {
        int parkAttendance = 0;
        System.out.println(parkAttendance); // 0
        System.out.println(++parkAttendance); // 1
        System.out.println(parkAttendance); // 1
        System.out.println(parkAttendance--); // 1
        System.out.println(parkAttendance); // 0
    }
}
