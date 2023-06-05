public class ThreadMethodsEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program started!");
        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println("Current Thread name :" + tname);
        t.setName("MyName");
//        Thread.sleep(5000);
        System.out.println("Current Thread name changed:" + t.getName());
//        System.out.println(t.getId());
        System.out.println(t.getState());
//        Thread.sleep(5000);
//        System.out.println(t.getState());
        Ex obj = new Ex();
        obj.start();
        System.out.println("Program Ended");

    }
}

class Ex extends Thread{
    @Override
    public void run() {
        System.out.println("Ex thread running ... ");
    }
}
