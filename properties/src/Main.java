import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("/home/yash/Desktop/Training_LMS_Tasks/Java-practice/properties/abc.properties");
        p.load(fis);
//        System.out.println(p);
        String s = p.getProperty("yash@gmail.com");
//        System.out.println(s);
        p.setProperty("hardik@simform.com", "hardeek123");
        FileOutputStream fos = new FileOutputStream("/home/yash/Desktop/Training_LMS_Tasks/Java-practice/properties/abc.properties");
        p.store(fos, "updated password");
//        System.out.println(fos);
    }
}