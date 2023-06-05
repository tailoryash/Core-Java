import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class navigablemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap();
        tm.put(1, "yash");
        tm.put(0 , "parth");
        tm.put(100, "arpit");

        System.out.println(tm.ceilingEntry(1));
        System.out.println(tm.floorEntry(2));
        System.out.println(tm.lowerEntry(1));
        System.out.println(tm.higherEntry(0));
        System.out.println(tm.descendingMap());

//        System.out.println(tm.pollFirstEntry());
//        System.out.println(tm.pollLastEntry());
//        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> e:
             tm.entrySet()) {
            System.out.println(e.getValue() +" ," + e.getKey());
            if(e.getKey().equals(1)) {
               e.setValue("");
            }
        }
        System.out.println(tm);
    }
}
