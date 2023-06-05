import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(0);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

        Set<Integer> evenS = new HashSet<>();
        evenS.add(2);
        evenS.add(4);

//        s.removeAll(evenS);
        System.out.println(s);

//        for(Integer ss : s){
//            System.out.println(ss);
//        }
//            for(Iterator<Integer> it = s.iterator(); it.hasNext();){
//                System.out.println(it.next());
//            }

//        Iterator<Integer> it = s.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        s.forEach(course-> System.out.println(course));
    }
}