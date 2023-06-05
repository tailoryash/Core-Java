import java.util.*;

public class ex {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(1, "a");
        hm.put(0, "bb");
        hm.put(2, "z");

//        System.out.println(hm.putIfAbsent(1, "b"));
//        System.out.println(hm);
//        System.out.println(hm.putIfAbsent(3, "aa"));
//        System.out.println(hm);
//        System.out.println(hm.getOrDefault(4, "a"));
//        System.out.println(hm);

//        PriorityQueue pq = new PriorityQueue(0);
////        pq.add(0);
//        pq.offer(1);

        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(0);
        ls.add(2345);
        ls.add(10);
        ls.add(5);
        System.out.println(ls);
////        Collections.sort(ls);
//        System.out.println(ls);
//        System.out.println(Collections.binarySearch(ls, 9));
//        Collections.reverse(ls);
//        System.out.println(ls);
//        Collections.reverseOrder();
        System.out.println(ls);
        Collections.sort(ls);
        Collections.reverse(ls);
        System.out.println(ls);

    }
}
