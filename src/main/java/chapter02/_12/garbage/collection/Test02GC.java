package chapter02._12.garbage.collection;

public class Test02GC {

    /*
    Tracing Eligibility
    How does the JVM know when an object is eligible for garbage collection?
    The JVM waits patiently and monitors each object until it determines that
    the code no longer needs that memory. An object will remain on the heap
    until it is no longer reachable. An object is no longer reachable when one of
    two situations occurs:

    # The object no longer has any references pointing to it.
    # All references to the object have gone out of scope.

     */
}
