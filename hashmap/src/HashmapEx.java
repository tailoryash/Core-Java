import java.util.HashMap;
import java.util.Map;

public class HashmapEx {
    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        map.put(1, new Student("Yash", "Tailor"));

        map.put(2, new Student("Arpit", "P"));
        map.put(3, new Student("Parth", "S"));
        System.out.println(map);
    }

}
