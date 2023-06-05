import java.util.StringTokenizer;

public class tokenOrg {
    public static void main(String[] args) {
//        StringTokenizer st = new StringTokenizer("yash tailor s");
        StringTokenizer st = new StringTokenizer("27-06-2001", "-");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}
