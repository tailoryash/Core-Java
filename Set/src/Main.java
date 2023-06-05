import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add(10);
        System.out.println(s);
        s.add(10);
        s.addAll(Set.of(10, 20, 30));
        System.out.println(s);

        HashSet hs = new HashSet();
        hs.addAll(Set.of(10, 20, 30));
        System.out.println(hs);
        LinkedHashSet lhs = new LinkedHashSet(3);
        lhs.add(10);
        lhs.add(20);

        lhs.add(10);

        lhs.add(null);
        System.out.println(lhs);
        lhs.add("Yash");
        System.out.println(lhs);

        HashSet<Integer> lhsI = new LinkedHashSet<>();
        lhsI.add(10);
        lhsI.add(30);
        lhsI.add(20);
        lhsI.add(10);
        System.out.println(lhsI);

    }
}

//class abc  implements Comparable{
//
//}