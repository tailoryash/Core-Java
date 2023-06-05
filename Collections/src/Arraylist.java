import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> ls= new ArrayList<>();
        ls.add(10);
        ls.add(20);
        ls.add(340);
        ls.add(10);
        System.out.println(ls);
        Collections.sort(ls);
        System.out.println(ls);


    }
}
