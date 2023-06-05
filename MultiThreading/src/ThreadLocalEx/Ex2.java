package ThreadLocalEx;

public class Ex2 extends Thread{
    static Integer cId = 0;
    private static ThreadLocal tl = new ThreadLocal(){
        protected Integer initialValue(){
            return ++cId;
        }
    };

    Ex2(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Executing with customer id:"+tl.get());
    }
}

class Demo{
    public static void main(String[] args) {
        Ex2 t1 = new Ex2("Customer thread-1");
        Ex2 t2 = new Ex2("Customer thread-2");
        Ex2 t3 = new Ex2("Customer thread-3");
        Ex2 t4 = new Ex2("Customer thread-4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

