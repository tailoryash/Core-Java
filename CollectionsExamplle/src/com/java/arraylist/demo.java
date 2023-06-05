package com.java.arraylist;

import java.lang.reflect.Array;
import java.util.*;

public class demo {


    public static void main(String[] args) {
        List ls = new ArrayList<>();
        ls.add(0);
        ls.add(null);
        ls.add("Uash");
        ls.add(true);

//        System.out.println(Arrays.toString(ls.toArray()));

        List newLs = new ArrayList();
        newLs.add(10);
        ls.addAll(newLs);
//        System.out.println(ls);

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(101, "Yash Tailor"));
        emp.add(new Employee(102, "Arpit"));

//        System.out.println();
//        ListIterator itr = emp.listIterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

        Collections.sort(emp, new Sorting());
        System.out.println(emp);
    }

}

class Sorting implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.empName.compareTo(o2.empName);
    }
}
