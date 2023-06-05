package Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Ex3 extends Thread{
    static ReentrantLock l=new ReentrantLock();
    Ex3(String name){
        super(name);
    }

    @Override
    public void run() {
        do{
            try{
                if(l.tryLock(5000, TimeUnit.MICROSECONDS)){
                    System.out.println(Thread.currentThread().getName() + "--got lock");
                    Thread.sleep(10000);
                    l.unlock();
                    System.out.println(Thread.currentThread().getName() + "--releases lock");
                    break;
                }else{
                    System.out.println(Thread.currentThread().getName() + "--unable to get lock and will try again");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }while (true);
    }
}

class Exdemo{
    public static void main(String[] args) {
        Ex3 t1 = new Ex3("First Thread");
        Ex3 t2 = new Ex3("second Thread");
        t1.start();
        t2.start();
    }
}