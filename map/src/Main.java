import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "Yash Tailor");
        hm.put(102, "arpit");
        hm.put(103, "parth");


//        System.out.println(hm.get(101));
//        System.out.println(hm.remove(103));
//        System.out.println(hm.containsKey(101));
//        System.out.println(hm.containsValue("Yash Tailor"));
//        System.out.println(hm.isEmpty());
//        System.out.println(hm.size());
//        hm.clear();
//        System.out.println(hm);\
//        System.out.println(hm.entrySet());
        HashMap<Integer, String> newData = new HashMap<>();
        newData.put(104, "Yash Tailor");
        newData.put(105, "arpit");
        newData.put(106, "parth");
        hm.putAll(newData);
//        System.out.println(hm);
//        System.out.println(hm.keySet());
//        System.out.println(hm.entrySet());
//        System.out.println(hm.values());
//        System.out.println(hm.put(105, "hardik"));
//        System.out.println(hm);

//        Set s1 = hm.entrySet();
//        Iterator it = s1.iterator();
//        while (it.hasNext()) {
//            Map.Entry m1 = (Map.Entry) it.next();
//            System.out.println(m1.getKey() + " , " + m1.getValue());
//            if (m1.getKey().equals(101)) {
//                m1.setValue("Yash");
//                System.out.println(m1.getValue());
//            }
//        }
//        System.out.println(hm);
        System.out.println(hm);

    }
}


