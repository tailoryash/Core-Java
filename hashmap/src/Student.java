public class Student {
    private String fn;
    private String ln;

    public Student(String fn, String ln) {
        this.fn = fn;
        this.ln = ln;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fn='" + fn + '\'' +
                ", ln='" + ln + '\'' +
                '}';
    }
}
