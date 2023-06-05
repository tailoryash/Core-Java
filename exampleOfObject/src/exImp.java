public class exImp implements ex, ex2{


    public static void main(String[] args) {
//        ex obj1 = ()->{
//            System.out.println("Hello ex");
//        };
//
//        ex2 obj = ()->{
//            System.out.println("Hello ex2");
//        };
//
//        obj1.demo();
//        obj.demo();
        ex obj = new exImp();
        obj.show();
    }

    @Override
    public void show() {
        ex2.super.show();
    }
}
