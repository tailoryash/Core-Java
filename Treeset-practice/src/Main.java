import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("yash", 100);
        Employee e2 = new Employee("parth", 104);
        Employee e3 = new Employee("arpit", 101);

//        TreeSet al = new TreeSet();
//        al.add(e1);
//        al.add(e2);
//        al.add(e3);
//        System.out.println(al);

        TreeSet al = new TreeSet(new MyComp());
        al.add(e1);
        al.add(e2);
        al.add(e3);
        System.out.println(al);


    }
}

class MyComp implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        String s1 = e1.name;
        String s2 = e2.name;
        return s1.compareTo(s2);
    }
}

