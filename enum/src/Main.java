// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
enum Status{
    Running, Failed, Pending, Success;
}
public class Main {
    public static void main(String[] args) {
        Status[] ss = Status.values();
        for(Status s: ss){
            System.out.println(s + ":" + s.ordinal());
        }

        Status s = Status.Failed;
        System.out.println(s);
    }
}