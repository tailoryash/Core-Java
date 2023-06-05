package Daemon;

public class DaemonEx {
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().isDaemon());
////        can't - Thread.currentThread().setDaemon(true);
//        MyThread t = new MyThread();
//        System.out.println(t.isDaemon());
//        t.setDaemon(true);
//        System.out.println(t.isDaemon());

        MyThread t = new MyThread();
        t.setDaemon(true);
        t.start();
        System.out.println("End of Main Thread");
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
