import java.util.*;

public class Treeset
{
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(new MyComp());
        ts.add(0);
        ts.add(1);
        ts.add(21);
        ts.add(2);

        ArrayList ls = new ArrayList();
        ls.add(10);

//        System.out.println(ts);
//
//        Iterator i = ts.descendingIterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
//        System.out.println(ts.pollFirst());
//        System.out.println(ts.pollLast());

    HashSet<String> hs = new HashSet(10, 0.5f);

        hs.add("a");
        hs.add("b");
//        System.out.println(hs.hashCode());
//        hs.add();
//        hs.add(3);
//        hs.add(4);
//        hs.add(5);
//        System.out.println(hs.hashCode());
//        hs.add(6);
//        System.out.println(hs.hashCode());

        SortedSet<Integer> ss = new TreeSet<>();
        ss.add(1);
        ss.add(3);
        ss.add(4);
        ss.add(5);
//        System.out.println(ss);


//        yash obj = new Treeset();
//        obj.display();
//        obj.
        System.out.println(ts);


    }
//    Set sync = Collections.synchronizedSet(ts);
}
class MyComp implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
//        return i2.compareTo(i1);
//        return i1.compareTo(i2);
//        return -i1.compareTo(i2);
//        return +1;
//return -1;
return 0;
    }
}

//interface yash{
//    default void display(){
//        System.out.println("print");
//    }
//}
