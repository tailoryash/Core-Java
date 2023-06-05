final public class mututableClass {
    private int i;
    mututableClass(int i){
        this.i = i;
    }
    public mututableClass modify(int i){
        if(this.i == i) return this;
        else return new mututableClass(i);
    }

    public static void main(String[] args) {
        mututableClass t1 = new mututableClass(10);
        mututableClass t2 = t1.modify(100);
        mututableClass t3 = t1.modify(10);
        System.out.println(t1 == t2);
        System.out.println(t1 == t3);
    }
}
