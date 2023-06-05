import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class sortedmp {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(101, "yash");
        hm.put(102,"tailor");
        SortedMap sm = new TreeMap(hm);
        System.out.println(sm );
        System.out.println(sm.firstKey());
        System.out.println(sm.lastKey());
        System.out.println(sm.headMap(102));
        System.out.println(sm.tailMap(102));
        System.out.println(sm.subMap(101, 101));
        System.out.println(sm.comparator());


    }
}
