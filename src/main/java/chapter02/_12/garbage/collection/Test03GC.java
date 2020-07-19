package chapter02._12.garbage.collection;

public class Test03GC {
}

class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two; // the "a" object is eligible for GC.
        String three = one;
        one = null;
    }
}