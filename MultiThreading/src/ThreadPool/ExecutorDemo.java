package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        PrintJob[] jobs = {
                new PrintJob("Yash"),
                new PrintJob("Tailor"),
                new PrintJob("arpirt"),
                new PrintJob("parth"),
                new PrintJob("hardeek"),
                new PrintJob("mihir")
        };
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (PrintJob job : jobs) {
            service.submit(job);
        }
        service.shutdown();
    }
}

class PrintJob implements Runnable {
    String name;

    public PrintJob(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "--Job started by Thread:" + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + "---Job completed by Thread:" + Thread.currentThread().getName());
    }
}
