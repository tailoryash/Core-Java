class A{
    void  showA() {
        System.out.println("A method");
    }
}

class B extends A{
    void showB(){

        System.out.println("B method");
    }

}
class C extends B {

    void showC() {
        System.out.println("C method");
    }

    public static void main(String[] args) {
        C objC = new C();
        objC.showC();
        objC.showB();
        objC.showA();
    }
}
