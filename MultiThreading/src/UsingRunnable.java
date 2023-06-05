public class UsingRunnable implements Runnable {
    public static void main(String[] args) {
        UsingRunnable obj = new UsingRunnable();
        Thread thread = new Thread(obj);
        UsingThreadEx threadEx = new UsingThreadEx();
        thread.start();
        threadEx.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1 :" + i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
