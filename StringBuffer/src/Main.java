// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append(10);
        sb.append("Yash Tailor");
        sb.append('S');
        sb.append(1.00);

        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.insert(0, "Hello"));
        System.out.println(sb.insert(5, " "));

        System.out.println(sb.delete(5,7));
        System.out.println(sb.deleteCharAt(5));
        System.out.println(sb.reverse());
        sb.setLength(10);
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());

    }
}