public class Employee {
    private final  int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEx() {
        return ex;
    }

    private final int ex=10;
//    public Employee(){
//
//    }
    public static void show(){
        Employee e = new Employee(12, "dasd");
        System.out.println(e.empId);
    }
    public static void companyStatic() {
        System.out.println("CEO, CTO--static");
    }

    private static void thisIsPrivateStatic() {
        System.out.println("Private static method");
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void company() {
        System.out.println("CEO, CTO");
    }

    private void thisIsPrivate() {
        System.out.println("Private method");
    }


}
