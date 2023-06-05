package ThreadLocalEx;

public class ThreadLocalDemo1 {
    public static void main(String[] args) {
//        ThreadLocal tl = new ThreadLocal();
//        System.out.println(tl.get());
//        tl.set("yash");
//        System.out.println(tl.get());
//        tl.remove();
//        System.out.println(tl.get());

        ThreadLocal tl = new ThreadLocal(){
            public Object initialValue(){
                return "yash";
            }
        };
        System.out.println(tl.get());
        tl.set("yash tailor");
        System.out.println(tl.get());
        tl.remove();
        System.out.println(tl.get());
    }
}
