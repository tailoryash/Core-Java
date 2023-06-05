abstract public class Main implements ex{
    @Override
    public void m1() {
        System.out.println("M1 method");
    }


}

class Child extends Main{
    @Override
    public void m2() {
        System.out.println("M2 method");
    }
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.m1();
        c1.m2();
    }

}
