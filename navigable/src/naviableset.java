import java.util.TreeSet;

public class naviableset {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(22);
        ts.add(203);
        ts.add(304);
        ts.add(304567);


        System.out.println(ts.ceiling(99));
        System.out.println(ts.higher(100));
        System.out.println(ts.floor(203));
        System.out.println(ts.lower(203));
//        System.out.println(ts.pollLast());
//        System.out.println(ts.pollFirst());
        System.out.println(ts);
        System.out.println(ts.descendingSet());
        System.out.println(ts.first());

        System.out.println(ts.headSet(203));
        System.out.println(ts.tailSet(203));
        System.out.println(ts.subSet(100, 304));
    }
}
