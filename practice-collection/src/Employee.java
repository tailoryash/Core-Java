import java.util.Comparator;

public class Employee implements Comparator<Employee> {
    int empId;
    String empName;
    String empDept;

    public Employee() {
    }

    public Employee(int empId, String empName, String empDept) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                '}';
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }


    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.empName.compareTo(o1.empName);
    }
}
