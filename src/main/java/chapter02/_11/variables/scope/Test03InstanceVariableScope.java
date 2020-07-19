package chapter02._11.variables.scope;

public class Test03InstanceVariableScope {
}

class Mouse {
    final static int MAX_LENGTH = 5;
    int length;
    public void grow(int inches) {
        if (length < MAX_LENGTH) {
            int newSize = length + inches;
            length = newSize;
        }
    }
}
/*
    # Local variables: In scope from declaration to end of block
    # Instance variables: In scope from declaration until object eligible for garbage collection
    # Class variables: In scope from declaration until program ends
 */