public class waitNotifyExample {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b){
            System.out.println("Main thread rying to call wait()");
            b.wait();
        }
        System.out.println("Main thread got noti");
        System.out.println(b.total);
    }
}

class ThreadB extends Thread{
    int total = 0;

    @Override
    public void run() {
        synchronized (this){
            System.out.println("Child thread start calculation !");
            for (int i = 0; i <= 100; i++) {
                total = total+i;
            }
            System.out.println("Child thread tryomg to give notification");
            this.notify();
        }
    }
}
