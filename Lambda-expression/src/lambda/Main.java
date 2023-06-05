package lambda;

public class Main {
    public static void main(String[] args) {
//        MyInterface impHello = new myImplementation();
//        impHello.sayHello();
//        MyInterface i = new MyInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("this is anonymous class");
//            }
//        };
//        i.sayHello();
//
//        MyInterface i2 = new MyInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("this is anonymous class");
//            }
//        };
//        i2.sayHello();

//        MyInterface i = ()->System.out.println("Lambda expression");
//
//        i.sayHello();

//        SumInterface sum = (a, b) -> a + b;
//        System.out.println(sum.sum(0, 5));

        lengthInterface il =str-> str.length();
        System.out.println(il.getLength("Yash tailor"));

    }

}
