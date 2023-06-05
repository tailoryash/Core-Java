class Test{
    Test(thisInConstructor m){
        System.out.println("test class");
    }
}
public class thisInConstructor {
//    thisInConstructor(){
//        this(10);
//        System.out.println("no args");
//    }
//    thisInConstructor(int a){
//
//        System.out.println("args");
//    }
//    void a(thisInConstructor td){
//        System.out.println("this is a method");
//    }
//    void b(){
//        a(this);
//    }
//    void a(){
//
//        System.out.println("a");
//    }
//    void b(){
//        a();
//        System.out.println("b");
//    }
//    void c(){
//        b();
//        System.out.println("c");
//    }

    public static void main(String[] args) {
//        thisInConstructor ts = new thisInConstructor();
//        ts.c();
        thisInConstructor ts = new thisInConstructor();
//        ts.show();
        ts.demo();
    }
//    void show(){
//        Test t = new Test(this);
//
//    }

    thisInConstructor demo(){
        return this;
    }
}


