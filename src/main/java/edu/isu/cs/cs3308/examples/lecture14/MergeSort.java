package edu.isu.cs.cs3308.examples.lecture14;

import java.util.Arrays;

public class MergeSort implements SortStrategy {

    public <T extends Comparable<T>> void sort(T[] array) {
        if (array.length > 1) {
            T[] sub1 = Arrays.copyOfRange(array, 0, array.length / 2);
            sort(sub1);
            T[] sub2 = Arrays.copyOfRange(array, array.length / 2 + 1, array.length - 1);
            sort(sub2);

            for (int i = 0, j = 0; i + j < array.length; ) {
                if (i >= sub1.length) {
                    array[i + j] = sub2[j];
                    j++;
                }
                else if (j >= sub2.length) {
                    array[i + j] = sub1[j];
                    i++;
                }
                else if (sub1[i].compareTo(sub2[j]) < 0) {
                    array[i + j] = sub1[i];
                    i++;
                } else {
                    array[i + j] = sub2[j];
                    j++;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Sequential MergeSort";
    }
}
