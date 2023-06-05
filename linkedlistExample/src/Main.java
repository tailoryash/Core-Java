import java.util.Iterator;
import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("yash");
        ll.add("arpit");
        ll.add("parth");
        System.out.println(ll);

        ll.add(2, "hardeek");
        ll.add("parth");
        ll.add("parth");
        System.out.println(ll);

        ll.addFirst("tailor");
        ll.addLast("simform");
        System.out.println(ll);

        System.out.println(ll.contains("parth"));

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.get(2));

        for (String name :
                ll) {
            System.out.print(name + ",");
        }
        System.out.println();

//        System.out.println(ll.removeFirst());
//        System.out.println(ll.removeLast());
//        System.out.println(ll.remove("hardeek"));
//        System.out.println(ll);
//        ll.clear();
//        System.out.println(ll);

//        System.out.println(ll.indexOf("hardeek"));
//        System.out.println(ll.lastIndexOf("parth"));
//
//        Iterator<String> it = ll.iterator();
//        while (it.hasNext()){
//            String pr = (String)it.next();
//            System.out.println(pr);
//        }

        ll.forEach((ele)->{
            System.out.println(ele);
        });

    }
}