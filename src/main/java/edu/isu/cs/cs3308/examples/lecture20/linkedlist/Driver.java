package edu.isu.cs.cs3308.examples.lecture20.linkedlist;

import java.util.Iterator;

/**
 *
 * @author griffith
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(7);
        list.addFirst(1);
        list.addLast(8);

        //list.printList();   

        //print
        for (Integer item : list) {
            System.out.println(item);
        }

        list.forEach(x -> System.out.println(x) );

        list.forEach(System.out::println);

        //check for order
        Integer previous = null;
        for (Integer next : list) {
            //check
            if (previous == null) {
                previous = next;
            }
            if (previous > next) {
                System.out.println("Not sorted!");
            }
            previous = next;
        }
    }
}
