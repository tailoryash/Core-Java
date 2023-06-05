 class A1 {
    void showA(){
        System.out.println("A method");
    }
}

class B1 extends A1{
    void showB(){
        System.out.println("B method");
    }
}

class C1 extends A1{
    void showC(){
        System.out.println("C method");
    }

    public static void main(String[] args) {
        C1 objC = new C1();
        objC.showC();
        objC.showA();
        System.out.println("-------------------------");
        B1 objB = new B1();
        objB.showB();
        objB.showA();
    }
}
