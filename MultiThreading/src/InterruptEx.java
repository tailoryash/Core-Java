public class InterruptEx extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("I'm yash");
                Thread.sleep(1000);
                System.out.println("After sleep");
            }
        } catch (InterruptedException e) {
            System.out.println("Got Interrupted !");
        }
    }
}

class Demo {
    public static void main(String[] args) {
        InterruptEx obj = new InterruptEx();
        obj.start();
        obj.interrupt();
        for (int i = 0; i < 10; i++) {
            System.out.println("Ending!");
        }
    }
}
