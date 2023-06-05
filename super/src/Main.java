// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends A{
    int i = 20;
    void show(int i){
        System.out.println(super.i);
        System.out.println(i);
        System.out.println(this.i);

    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.show(30);
    }
}
class A{
    int i = 10;
}