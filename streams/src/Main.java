import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> ls = new ArrayList<Integer>();
//        ls.add(10);
//        ls.add(5);
//        ls.add(350);
//        ls.add(135);
//        System.out.println(ls);
//
//        List<Integer> l2 = ls.stream().filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(l2);

//        List<Integer> ls = new ArrayList<>();
//        ls.add(10);
//        ls.add(5);
//        ls.add(20);
//        ls.add(135);

//        System.out.println(ls);

//        ls = ls.stream().map(i->i+5).collect(Collectors.toList());
//        ls = ls.stream().sorted((i1, i2)->).collect((Collectors.toList()));
//        System.out.println(ls);

//        ArrayList<String> ls = new ArrayList<>();
//        ls.add("Yash Tailor");
//        ls.add("yash");
//        ls.add("yasdfghj");
//
//        Comparator<String> c = (s1, s2)->{
//              int l1 = s1.length();
//              int l2 = s2.length();
//              if(l1 < l2) return -1;
//              else if(l1 > l2) return 1;
//              else return s1.compareTo(s2);
//        };
//        List<String> listByLength = ls.stream().sorted(c).collect(Collectors.toList());
//        System.out.println(listByLength);


//        long num = listByLength.stream().count();
//        System.out.println(num);


        List<Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(5);
        ls.add(20);
        ls.add(135);
//        Consumer<Integer> c = i -> {
//            System.out.println("The square of " + i + " is: " + (i * i));
//        };
////        ls.stream().forEach(System.out :: println);
//        ls.stream().forEach(c);

//        Integer[] i = ls.stream().toArray(Integer[]::new);
//        for(Integer ii : i){
//            System.out.println(ii);
//        }

        Stream s = Stream.of(24,576,4567,6578);
        s.forEach(System.out::println);


    }
}