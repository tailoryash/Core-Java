package produce_consumer_problem;

public class  Company {
    int n;
    boolean f = false;
    //f = false means changes to produce
    synchronized public void produce_item(int n) throws InterruptedException {
        if(f){
            wait();
        }
        this.n = n;
        System.out.println("Produced : " + this.n);
        f = true;
        notify();
    }
    //f = true means changes to consumed
    synchronized public int consume_item() throws InterruptedException {
        if(!f){
            wait();
        }
        System.out.println("Consumed : " + this.n);
        f = false;
        notify();
        return this.n;
    }
}
