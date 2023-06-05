//Inheritance - ISA relationship
//parent and child are tightly coupled
class parent{
    void  showA() {
        System.out.println("A method");
    }
}

class child  extends parent{
    void showB(){

        System.out.println("B method");
    }

    public static void main(String[] args) {
        child objB = new child();
        objB.showB();
        objB.showA();
    }

}