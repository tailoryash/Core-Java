import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        String mobNo = "yash.tailor@gmail.co";
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+");
//        long num = 9426600828L;
        Matcher m = p.matcher(mobNo);
        if(m.matches()){
            System.out.println("Valid Email");
        }else{
            System.out.println("Not Valid");
        }
    }
}
