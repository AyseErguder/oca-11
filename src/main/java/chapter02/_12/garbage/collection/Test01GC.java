package chapter02._12.garbage.collection;

public class Test01GC {

    /*
    Garbage collection refers to the process of automatically freeing memory
    on the heap by deleting objects that are no longer reachable in your program
     */

    /**
     In Java and other languages, eligible for garbage collection refers to an
     object’s state of no longer being accessible in a program and therefore able
     to be garbage collected
     */

    /*
    Java includes a built-in method to help support garbage collection that can
    be called at any time.

     */

    public static void main(String[] args) {
        System.gc();
        /**
         *  Nothing, actually. It merely suggests that the JVM kick off garbage collection. The JVM may
         * perform garbage collection at that moment, or it might be busy and choose
         * not to. The JVM is free to ignore the request
         */
        /*
        When is System.gc() guaranteed to be called by the JVM? Never, actually
         */
    }
}
