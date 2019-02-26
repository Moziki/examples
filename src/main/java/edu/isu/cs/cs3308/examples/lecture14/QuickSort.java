package edu.isu.cs.cs3308.examples.lecture14;

import java.util.concurrent.RecursiveTask;

public class QuickSort implements SortStrategy {

    public <T extends Comparable<T>> void sort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private <T extends Comparable<T>> void quickSort(T[] array, int start, int end) {
        if (start < end) {
            int pivot = selectPivot(array);

            int left = start;
            int right = end - 1;

            int x = 0;
            while (left <= right) {
                if (array[right].compareTo(array[pivot]) >= 0)
                    right--;
                else
                    x++;
                if (array[left].compareTo(array[pivot]) < 0)
                    left++;
                else
                    x++;

                if (x == 2) {
                    swap(array, left, right);
                }
            }

            swap(array, left, pivot);

            quickSort(array, start, right);
            quickSort(array, left + 1, end);
        }
    }

    public <T extends Comparable<T>> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public <T extends Comparable<T>> int selectPivot(T[] array) {
        return array.length - 1;
    }

    public String toString() {
        return "Sequential QuickSort";
    }
}
