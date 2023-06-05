import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        String s1 = "Durga";
//        System.out.println(s1.equalsIgnoreCase("DURGA"));
//        // .equalsIgnoreCase check only contains whether its is lowercase or uppercase
//        s1 =  s1.replace('a', 'o');
//        System.out.println(s1);
//        s1 = s1.substring(2);
//        System.out.println(s1);
//        String a = "absdddd";
//        a = a.substring(0,3);
//        System.out.println(a);
//
//        String name = "yash tailor";
//
//        System.out.println(name.indexOf('t'));
//
//        System.out.println(name.indexOf('a'));
//        System.out.println(name.lastIndexOf('a'));
//
//        System.out.println(name.hashCode());

        String s = "Yash.Tailor,Suryakant";
        String[] sen = s.split("\\.");
        System.out.println(Arrays.toString(sen));
        String s1 = new String("Yash").intern();
        String s2 = "Yash".intern();
        System.out.println(s1 == s2);

    }
}