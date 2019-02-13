package edu.isu.cs.cs3308.Lecture06;

import java.util.Random;

public class Driver {

    public static void main(String args[]) {
        Random rand = new Random();

        int array[] = new int[100000];
        for (int i = 0; i < array.length; i++)
            array[i] = i;

        Search op = select(false);
        long start = System.currentTimeMillis();
        System.out.println(op.search(array, 99999));
        long end = System.currentTimeMillis();

        System.out.println("Time: " + (end - start));

        op = select(true);
        start = System.currentTimeMillis();
        System.out.println(op.search(array, 99999));
        end = System.currentTimeMillis();

        System.out.println("Time: " + (end - start));

    }

    private static Search select(boolean ordered) {
        if (ordered)
            return new BinarySearch();
        return new LinearSearch();
    }
}
