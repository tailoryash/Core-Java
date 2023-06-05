import java.util.*;

public class identityHashmp {


    public static void main(String[] args) {
        IdentityHashMap ihm  = new IdentityHashMap();  // JVM use to checks == operator and in hashmap checks .equals()
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        ihm.put(i1, "yash");
        ihm.put(i2, "tailor");
        System.out.println(ihm);
    }
}
