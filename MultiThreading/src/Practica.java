public class Practica extends Thread{
//    public static void main(String[] args) {
////        System.out.println(Thread.MIN_PRIORITY);
////        System.out.println(Thread.MAX_PRIORITY);
////        System.out.println(Thread.NORM_PRIORITY);
////        Thread t = new Thread();
////        t.setName("yash");
////        System.out.println(t.getName());
////        t.setPriority(4);
////        System.out.println(t.getPriority());
////        Thread.currentThread().setPriority(7);
////        System.out.println(Thread.currentThread().getPriority());
//        Practica obj = new Practica();
//
////        System.out.println(obj.getPriority());
//
//    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("Child thread");
        }
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        Practica obj = new Practica();
        obj.setPriority(1);
        obj.start();
        Thread.currentThread().setPriority(10);
        for(int i = 0; i < 10; i++){
            System.out.println("Main Thread");
        }
    }
}
