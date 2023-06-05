package produce_consumer_problem;

public class Consumer extends Thread {
    Company c;

    Consumer(Company c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.c.consume_item();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
