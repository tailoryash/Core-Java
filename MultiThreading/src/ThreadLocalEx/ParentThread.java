package ThreadLocalEx;

public class ParentThread extends Thread {
    //    static ThreadLocal tl = new ThreadLocal();
//    static InheritableThreadLocal tl = new InheritableThreadLocal();
    public static InheritableThreadLocal tl = new InheritableThreadLocal() {
        public Object childValue(Object p){
            return "yash-child";
        }
    };

    @Override
    public void run() {
        tl.set("yash");
        System.out.println("Parent value : " + tl.get());
        ChildThread ct = new ChildThread();
        ct.start();
    }
}

class ChildThread extends Thread {
    @Override
    public void run() {
        System.out.println("Child Thread : " + ParentThread.tl.get());
    }
}

class ThreadRun {
    public static void main(String[] args) {
        ParentThread pt = new ParentThread();
        pt.start();
    }
}