package com.java.arraylist;

import java.util.*;

public class listiterator {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(20);
        ls.add(340);
        ls.add(14);
        LinkedList llist = new LinkedList();
        llist.add((100));
        Iterator iii = ls.iterator();

        ListIterator it = ls.listIterator(1);
//        while(it.hasNext()){
//            System.out.println(it.previous() + "," + it.next());
//        }

        System.out.println() ;

        Vector vs = new Vector(llist);
        vs.add(10);
        vs.add(20);
        System.out.println(vs);
        vs.add(1000);
        System.out.println(vs);
//        vs.addElement('S');
        System.out.println(vs);
//        vs.removeElement(10);
//        vs.removeElementAt(0);
//        vs.removeAll(ls);
//        vs.removeAllElements();


        System.out.println(vs.firstElement());
        System.out.println(vs.capacity());
        System.out.println(vs.size());
        System.out.println(vs.clone());

        Enumeration e = vs.elements();
        while(e.hasMoreElements()){
            Integer i = (Integer) e.nextElement();
            System.out.println(i);
        }
//        System.out.println(vs);


    }


}
