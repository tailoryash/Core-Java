package Locks;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
    ReentrantLock l  = new ReentrantLock();
    public void wish(String name){
        l.lock();
        for(int i = 0; i< 10; i++){
            System.out.print("Morning:");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
            System.out.println(name);
        }
        l.unlock();
    }
}

class MyThread extends Thread{
    Display d;
    String name;
    MyThread(Display d, String name){
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}

class RUNeX{
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "yash");
        MyThread t2 = new MyThread(d, "Yuvraj");
        MyThread t3 = new MyThread(d, "Arpit");
        t1.start();
        t2.start();
        t3.start();
    }
}
