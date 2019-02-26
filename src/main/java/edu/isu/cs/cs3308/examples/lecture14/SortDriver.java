package edu.isu.cs.cs3308.examples.lecture14;

import java.util.Random;

public class SortDriver {

    public static void main(String args[]) {
        Integer[] array = createRandArray(250000);
        test(array, new MergeSort());
        test(array, new QuickSort());
        test(array, new ParallelMergeSort());
        test(array, new ParallelQuickSort());
    }

    private static void test(Integer[] array, SortStrategy strategy) {
        System.out.println(strategy);
        long start = System.nanoTime();
        strategy.sort(array);
        long end = System.nanoTime();
        System.out.println("Took: " + (end - start) + " ns\n");
    }

    private static Integer[] createRandArray(int size) {
        Random rand = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = rand.nextInt(9999) + 1;
        }

        return array;
    }
}
