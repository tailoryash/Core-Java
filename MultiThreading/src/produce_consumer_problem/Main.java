package produce_consumer_problem;

public class Main {
    public static void main(String[] args) {
        Company com = new Company();
        Producer p = new Producer(com);
        Consumer c = new Consumer(com);
        p.start();
        c.start();
    }

}
