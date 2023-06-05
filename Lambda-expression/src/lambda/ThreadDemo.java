package lambda;

public class ThreadDemo {

    public static void main(String[] args) {
        Runnable t1 = () -> {
            for (int i = 1; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t = new Thread(t1);
        t.setName("MyThread");
        t.start();

        Runnable t2 = () -> {

            try {
                for (int i = 10; i < 20; i++) {
                    System.out.println(i * 2);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread t22 = new Thread(t2);
        t22.start();
    }
}
