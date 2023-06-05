package produce_consumer_problem;

public class Producer extends Thread {
    Company c;

    Producer(Company c) {
        this.c = c;
    }

    @Override
    public void run() {
        int i = 1;
        while (true) {
            try {
                this.c.produce_item(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
