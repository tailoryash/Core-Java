import java.util.ArrayList;

public class min {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        ls.add(10);
        ls.add(5);
        ls.add(350);
        ls.add(135);
        System.out.println(ls);
        Integer min  = ls.stream().min((i1, i2)->i1.compareTo(i2)).get();
        System.out.println(min);

        Integer max  = ls.stream().max((i1, i2)->i1.compareTo(i2)).get();
        System.out.println(min);

    }
}
