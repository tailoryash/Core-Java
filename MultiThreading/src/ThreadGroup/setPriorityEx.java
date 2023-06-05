package ThreadGroup;

public class setPriorityEx {
    public static void main(String[] args) {
        ThreadGroup g1 = new ThreadGroup("Thread group=1");
        Thread t1 = new Thread(g1, "first thread");
        Thread t2 = new Thread(g1, "second thread");
        g1.setMaxPriority(3);
        Thread t3 = new Thread(g1, "Third thread");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
//        System.out.println(g1.activeCount());
        System.out.println(g1.activeGroupCount());
        g1.list();
        System.out.println();
    }
}
