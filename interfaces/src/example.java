
public interface example {
    static void show(){
        System.out.println("show");
    }
    default void show2(){
        System.out.println("Hello");
    }

}
