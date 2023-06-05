import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class hashmapexpractice {
    public static void main(String[] args) {
        // Creating HashMap and IdentityHashMap objects
        Map<String, String> hm = new HashMap<>();
        Map<Integer, String> ihm = new IdentityHashMap<>();

        // Putting key and value in HashMap and IdentityHashMap Object
        hm.put("hmkey", "hmvalue");
        hm.put(new String("hmkey"), "hmvalue1");
        String s = new String("ihmkey");
        String s1 = s;
        ihm.put(1, "ihmvalue");
        ihm.put(2, "ihmvalue1");
//        System.out.println(hm);
        System.out.println(ihm);

        // Print Size of HashMap and WeakHashMap Object
        // hm.size() will print 1 since it compares the objects logically
        // and both the keys are same
        System.out.println("Size of HashMap is : " + hm.size());

        // ihm.size() will print 2 since it compares the objects by reference
        System.out.println("Size of IdentityHashMap is : " + ihm.size());

    }

    void run(){
        System.out.println("helllo");
        this.run2();
    }
     void run2(){
        System.out.println("run2");
    }

}
