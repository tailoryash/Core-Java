import java.beans.IntrospectionException;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("yash", 1);
        map.put("arpit", 2);

        System.out.println(map.get("yash"));
        if(map.containsKey("yash")) System.out.println("okay");
        else System.out.println("Not ok");
        if(map.containsValue(1)){
            System.out.println("ok 1");
        }else{
            System.out.println("Not ok map");
        }

        Set<String> keys = map.keySet();
        System.out.println(keys);

        Collection<Integer> values = map.values();
        System.out.println(values);

//        for (Map.Entry<String, Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey()  + " ," + entry.getValue());
//        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " ," + entry.getValue());
        }

        map.forEach((K, V)->{
            System.out.println(" K " + K);
            System.out.println(" V " + V);
        });

    }
}