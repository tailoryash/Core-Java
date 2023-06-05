import java.util.WeakHashMap;

public class weakhm {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap m = new WeakHashMap();
        Temp t = new Temp();
        m.put(t, "yash");
        System.out.println(m);
        t = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(m);
    }
}

class Temp{
    @Override
    public String toString() {
        return "temp";
    }
    @Override
    public void finalize(){
        System.out.println("Finalize method called");
    }
}
