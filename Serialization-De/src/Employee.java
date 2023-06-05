import java.io.Serializable;

public class Employee implements Serializable {
    public int a;
    public String b;

    @Override
    public String toString() {
        return "Employee{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }

    public Employee(int a, String b) {
        this.a = a;
        this.b = b;
    }
}
