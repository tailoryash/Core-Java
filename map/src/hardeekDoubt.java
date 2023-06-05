import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class hardeekDoubt {
    @Override
    public String toString() {
        return "hardeekDoubt{}";
    }

    public static void main(String[] args) {
        HashMap hm = new HashMap();
//        int[] arr = {1,2,345,};
        hm.put(1, new String[]{"yash", "tailor"});
        hm.put(2, new String[]{"yash", "tailor"});
        hm.put(3, new String[]{"yash", "tailor"});


        for (Object e:
             hm.entrySet()) {
            System.out.println(e.toString());
        }
    }
}
