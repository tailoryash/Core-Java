// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static{
        System.loadLibrary("hello");
    }
    public native void hello(String name);
    public static void main(String[] args) {
        new Main().hello("Yash Tailor");
    }
}