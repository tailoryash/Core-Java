import java.lang.reflect.Field;

public class ex {
    public static void run(Employee emp, Field[] empFields) throws Exception{
        System.out.println("run method");
//        Employee e = new Employee(102, "yahs");
//        Field[] empFields = emp.getClass().getDeclaredFields();
        for(Field f : empFields){
            if(f.getName().equals("empName")){
//                f.setAccessible(true);
//                f.set(emp, "yash hardeek");
            }
        }
//        System.out.println(emp.getEmpId());
    }
}
