import java.util.Comparator;
import java.util.TreeMap;

public class treemapex {
    public static void main(String[] args) {
        TreeMap hm = new TreeMap(new myComp());
//        hm.put(100, "yash");
//        hm.put(1033, "yashss");
//        hm.put(1, "Ad");
//        hm.put(0, 2);
//hm.put(null,  "yash"); --error

        hm.put("d", 101);
        hm.put("z", "yahs");
        hm.put("a", 101);
        System.out.println(hm);
    }
}
class myComp implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}