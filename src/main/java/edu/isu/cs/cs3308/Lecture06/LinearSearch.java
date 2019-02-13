package edu.isu.cs.cs3308.Lecture06;

public class LinearSearch implements Search {


    @Override
    public int search(int[] array, int value) {
        if (array == null || array.length == 0)
            return -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }

        return -1;
    }
}
