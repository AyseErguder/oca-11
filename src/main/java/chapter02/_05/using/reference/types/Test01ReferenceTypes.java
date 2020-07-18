package chapter02._05.using.reference.types;

import java.util.Date;

public class Test01ReferenceTypes {

    /*
    A reference type refers to an object (an instance of a class). Unlike primitive
    types that hold their values in the memory where the variable is allocated,
    references do not hold the value of the object they refer to. Instead, a
    reference “points” to an object by storing the memory address where the
    object is located, a concept referred to as a pointer. Unlike other languages,
    Java does not allow you to learn what the physical memory address is. You
    can only use the reference to refer to the object
     */

    public static void main(String[] args) {
        Date today = new Date();
        String greeting = new String("How are you ?");
    }

    /*
     reference types can be assigned null, which means they do not currently refer to an object
     */

    // int value = null; // DOES NOT COMPILE
    String s = null;

    /*
     reference types can be used to call methods, assuming the reference is not null
     Primitives do not have methods declared on them
     */

    String reference = "hello";
    int len = reference.length();
     //int bad = len.length(); // DOES NOT CO
}
