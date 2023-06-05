class Display{
    public  void wish(String name){
        synchronized (Display.class){
            for (int i = 0; i < 10; i++) {
                System.out.print("Good Morning : ");
                try{
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name);
            }
        }

    }
}
//synchronized used only object and class level locked.
public class synchronizationEx extends Thread{
    Display d;
    String name;

    synchronizationEx(Display d, String name){
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}

class SynchDemo{
    public static void main(String[] args) {
        Display d = new Display();
        Display d1 = new Display();
        synchronizationEx t1 = new synchronizationEx(d, "yash");
        synchronizationEx t2 = new synchronizationEx(d1, "tailor");
        t1.start();
        t2.start();
    }
}