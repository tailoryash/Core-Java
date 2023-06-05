package ThreadGroup;

public class ex2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup g1 = new ThreadGroup("ParentGroup");
        ThreadGroup g2 = new ThreadGroup(g1, "ChildGroup");
        MyThread t1 = new MyThread(g1, "ChildThread=1");
        MyThread t2 = new MyThread(g1, "ChildThread=2");
        t1.start();
        t2.start();

        System.out.println(g1.activeCount());
        System.out.println(g1.activeGroupCount());
        g1.list();
        Thread.sleep(4000);
        System.out.println(g1.activeCount());
        System.out.println(g1.activeGroupCount());
        g1.list();
    }
}

class MyThread extends Thread {
    public MyThread(ThreadGroup g, String name) {
        super(g, name);
    }

    @Override
    public void run() {
        System.out.println("Child Thread");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}