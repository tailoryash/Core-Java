import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNo {
    public static void main(String[] args) {
        String mobNo = "917990953433";
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
//        long num = 9426600828L;
        Matcher m = p.matcher(mobNo);
        if(m.matches()){
            System.out.println("Valid phone number");
        }else{
            System.out.println("Not Valid");
        }
    }
}
