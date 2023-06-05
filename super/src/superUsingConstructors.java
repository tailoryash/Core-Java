public class superUsingConstructors extends A1{
    superUsingConstructors(){
        super();
        System.out.println("main method");
    }
    public static void main(String[] args) {
        superUsingConstructors obj = new superUsingConstructors();
    }


}

class A1{
    A1(){
        System.out.println("A class");
    }
}


