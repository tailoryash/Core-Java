public class example extends parent implements a {

    void child(){}

    @Override
    void hello() {
        super.hello();
    }

    @Override
    void hello2() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
//        a obj = new example();
//        obj.helloI();

        parent obj = new example();
//        obj.a  = 20;
//        obj.hello2();
        obj.a = 20;
        System.out.println(obj.a);



    }

    @Override
    public void helloI() {

    }
}

interface a{
    void helloI();
}

class parent{
     int a = 10;
    void hello(){

    }
    void hello2(){

    }
}
