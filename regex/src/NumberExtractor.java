import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractor {
    public static void main(String[] args) throws Exception{
        PrintWriter out = new PrintWriter("regex/src/output.txt");
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        BufferedReader br = new BufferedReader(new FileReader("regex/src/input.txt"));
        String line = br.readLine();
        while(line != null){
            Matcher m = p.matcher(line);
            while(m.find()){
                out.println(m.group());
            }
            line = br.readLine();
        }

//        out.flush();
        out.close();
    }
}
