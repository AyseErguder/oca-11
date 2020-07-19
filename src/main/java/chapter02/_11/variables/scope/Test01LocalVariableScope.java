package chapter02._11.variables.scope;

public class Test01LocalVariableScope {

    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        } // bitesOfCheese goes out of scope here
        // System.out.println(bitesOfCheese); // DOES NOT COMPILE
        System.out.println(hungry);
    }

    public void eatIfHungryV2(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                var teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
        // System.out.println(teenyBit); // DOES NOT COMPILE
    }
}
