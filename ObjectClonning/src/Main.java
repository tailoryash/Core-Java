// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main implements Cloneable{
    int i;
    int j;

    @Override
    public String toString() {
        return "Main{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class B{
    public static void main(String[] args) throws CloneNotSupportedException {
        Main obj = new Main();
        obj.i = 10;
        obj.j = 20;
        System.out.println(obj);

        Main obj2 = obj;
        System.out.println(obj2);

        Main obj3 = (Main) obj.clone();
        System.out.println(obj3);


    }
}