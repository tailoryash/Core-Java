import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Yash");
        String filename = "Serialization-De/output.txt";
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream objS = new ObjectOutputStream(file);

            objS.writeObject(emp);
            objS.close();
            file.close();
        }catch (IOException e){
            System.out.println(e);
        }
        Employee emp1 = null;
        try{
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fis);
            emp1 = (Employee) in.readObject();
            System.out.println(emp1.toString());
            in.close();
            fis.close();
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e);
        }
    }
}