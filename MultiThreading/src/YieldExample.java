public class YieldExample extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("Child");
            Thread.yield();
        }
    }
}
class ThreadRun{
    public static void main(String[] args) throws InterruptedException {
        YieldExample obj = new YieldExample();
        obj.start();
        for (int i = 0; i < 10; i++){
            System.out.println("Main");
//            Thread.sleep(1000);
        }
    }
}
