import java.util.TreeMap;

public class treemapPractice {
    public static void main(String[] args) {
        TreeMap<Employee, Integer> empList = new TreeMap(new Employee());
        empList.put(new Employee(11, "Yash Tailor", "Java"), 1);
        empList.put(new Employee(9, "Arpit Panchal", "Open Source"), 0);
        empList.put(new Employee(1, "Parth Solanki", "PHP"), 5);
        empList.put(new Employee(12, "Shailesh Darji", "MEAN"), 3);

        empList.forEach((k, v) -> System.out.println(v + "="+ k));
    }
}
