import java.util.Hashtable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Hashtable h = new Hashtable();
        h.put(new Temp(5), "A");
        h.put(new Temp(6), "B");
        h.put(new Temp(2), "CC");
        h.put(new Temp(1), "XX");
        System.out.println(h);
    }
}

class Temp {
    int i;

    Temp(int i) {
        this.i = i;
    }

    public int hashCode() {
        return i;
    }

    public String toString() {
        return i + " ";
    }
}