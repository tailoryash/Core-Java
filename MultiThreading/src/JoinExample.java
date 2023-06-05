public class JoinExample  extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Yash Thread");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class ThreadDemo1{
    public static void main(String[] args) throws InterruptedException {
        JoinExample e = new JoinExample();
        e.start();
        e.join(4000);
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread");
        }
    }
}
