package chapter02._09.initialize.variables;

public class Test03InitializeInstanceVariable {

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);
    }
}

class Employee {
    private int age;
    private String name;
    private double salary;
    private char gender;
    private boolean retired;

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                ", retired=" + retired +
                '}';
    }
}
