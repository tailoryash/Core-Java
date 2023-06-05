import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception{
        Employee emp = new Employee(101, "Yash Tailor");
        Field[] empFields = emp.getClass().getDeclaredFields();
        for(Field f : empFields){
            System.out.println(f.get(emp));
        }
        for(Field f : empFields){
           if(f.getName().equals("ex")){
               f.setAccessible(true);
               f.set(emp, 110);
//               System.out.println(f.get(emp));
           }
        }
//        System.out.println(emp.getEx());

        for(Field f : empFields){
            if(f.getName().equals("empId")){
                f.setAccessible(true);
//                f.set(emp, 1052);
//                System.out.println(f.get(emp));
            }
        }
        System.out.println(emp.getEmpId());

        Method[] empMethods = emp.getClass().getDeclaredMethods();
//        for(Method m : empMethods){
//            System.out.println(m.getName());
//        }

//        for(Method m : empMethods){
//            if(m.getName().equals("thisIsPrivateStatic")){
////                m.invoke(emp);
//                m.setAccessible(true);
//                m.invoke(null);
//            }
//        }
//
//        Constructor[] con  = emp.getClass().getDeclaredConstructors();
//        for(Constructor c : con){
//            System.out.println(c.getName());
//        }
//         ex.run(emp, empFields);
//        Employee.show();
    }
}