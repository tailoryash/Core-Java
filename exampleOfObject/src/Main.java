// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    public void run(){
//        System.out.println("Hello this is run method");
//    }
//    public int add(){
//        return 100;
//    }
//    public static void main(String[] args) {
//        Main object = new Main();
//        object.run();
//        System.out.println("hello this is interval");
//        System.out.println(object.add());
//        Birds br = new Birds();
//        br.fly();
//    }
    String color;
    int age;
    void setDetails(String color, int age){
        this.color = color;
        this.age = age;
    }
    void display(){
        System.out.println(color + " " + age);
    }
    public static void main(String[] args) {
        Main animal = new Main();
//        animal.age = 10;
//        animal.color = "white";
//        System.out.println(animal.age + " " + animal.color);
         animal.setDetails("white", 10);
         animal.display();
    }
}