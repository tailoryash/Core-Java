import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class treesetexampleofString{


    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyCompara());
//        ts.add("yash");
//        ts.add("yjsh");
//        ts.add("arpit");
//        ts.add("yaah");

        ts.add("A");
        ts.add(new StringBuffer("AA"));
        ts.add(new StringBuilder("BCD"));
        ts.add(new StringBuffer("XX"));


//        System.out.println(ts);
//        HashSet hs = new HashSet(5, 0.5f);

    }


}
class MyCompara implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1 < l2) return -1;
        else if(l1 > l2) return 1;
        else return s1.compareTo(s2);
    }

//    @Override
//    public int compare(Object o1, Object o2) {
//        String s1 = o1.toString();
//        String s2 = o2.toString();
//
//        return s1.compareTo(s2);
//    }


}
