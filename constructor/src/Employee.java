public class Employee {
    String name;
    int id;
    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("yash", 100);
        Employee e2 = new Employee("arpit", 101);
        System.out.println("Employee 1:" + e1.name + " "  + e1.id);
        System.out.println("Employee 2:" + e2.name + " "  + e2.id);

    }
}
