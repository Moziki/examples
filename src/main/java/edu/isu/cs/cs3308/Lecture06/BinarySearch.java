package edu.isu.cs.cs3308.Lecture06;

public class BinarySearch implements Search {
    @Override
    public int search(int[] array, int value) {
        return searchRec(array, value, 0, array.length - 1);
    }

    private int searchRec(int[] array, int value, int begin, int end) {
        if (array == null || array.length == 0)
            return -1;
        if (begin > end)
            return -1;
        int index = (begin - end) / 2 + begin;
        if (array[index] == value)
            return array[index];
        else if (array[index] > value)
            return searchRec(array, value, begin, index - 1);
        else
            return searchRec(array, value, index + 1, end);
    }
}
