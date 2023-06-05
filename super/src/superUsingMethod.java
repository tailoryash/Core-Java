public class superUsingMethod extends B{
    public static void main(String[] args) {
        superUsingMethod obj = new superUsingMethod();
        obj.show();
    }
    void show(){
        super.m1();
        m1();
    }
    void m1(){
        System.out.println("main class");

    }
}
class B{
    void m1(){
        System.out.println("B class");
    }

}
