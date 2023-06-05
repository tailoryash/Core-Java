public class JoinEx2 extends Thread{
    static Thread mt;

    @Override
    public void run() {
        try{
            mt.join();

        }catch(InterruptedException e){}
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}

class ThreadJoinEx{
    public static void main(String[] args) throws InterruptedException{
        JoinEx2.mt = Thread.currentThread();
        JoinEx2 t = new JoinEx2();

        t.start();
//        t.join(); // create deadlock situation
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
//            Thread.sleep(2000);
        }
        System.out.println(t.getState());
    }
}
