package Locks;

import java.util.concurrent.locks.ReentrantLock;

public class MyThreadEx extends Thread{
    static ReentrantLock l = new ReentrantLock();
    MyThreadEx(String name){
        super(name);
    }

    @Override
    public void run() {
        if(l.tryLock()){
            System.out.println(Thread.currentThread().getName() + "--got lock and performing safe op..");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            l.unlock();
        }else{
            System.out.println(Thread.currentThread().getName() + "--unable to get lock and hence performing alt op");
        }
    }
}

class ReDemo3{
    public static void main(String[] args) {
        MyThreadEx t1 = new MyThreadEx("First Thread");
        MyThreadEx t2 = new MyThreadEx("Second Thread");
        t1.start();
        t2.start();
    }
}