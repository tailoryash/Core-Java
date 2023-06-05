public class UsingThreadEx extends Thread{
    public void run(){
        for (int i = 10; i >= 1; i--){
            System.out.println("Thread2:" + i);
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
