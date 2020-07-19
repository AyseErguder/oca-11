package chapter02._12.garbage.collection;

public class Test04GC {
    /*
    Java allows objects to implement a method called finalize(). This
    feature can be confusing and hard to use properly. In a nutshell, the
    garbage collector would call the finalize() method once. If the
    garbage collector didn’t run, there was no call to finalize(). If the
    garbage collector failed to collect the object and tried again later, there
    was no second call to finalize().
    This topic is no longer on the exam. In fact, it is deprecated in Object
    as of Java 9, with the official documentation stating, “The finalization
    mechanism is inherently problematic.” We mention the finalize()
    method in case Oracle happens to borrow from an old exam question.
    Just remember that finalize() can run zero or one times. It cannot run
    twice.

     */
}
