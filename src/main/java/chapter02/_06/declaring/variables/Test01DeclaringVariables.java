package chapter02._06.declaring.variables;

public class Test01DeclaringVariables {

    {
        zooName1 = "The Best Zoo";
        numberAnimals1 = 100;
    }

    String zooName1;
    int numberAnimals1;

    public static void main(String[] args) {
        Test01DeclaringVariables tt  = new Test01DeclaringVariables();

        System.out.println(tt.zooName1);
        System.out.println(tt.numberAnimals1);
    }


    String zooName2 = "The Best Zoo";
    int numberAnimals2 = 100;
}
