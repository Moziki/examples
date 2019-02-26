package edu.isu.cs.cs3308.examples.lecture14;

public interface SortStrategy {

  <T extends Comparable<T>> void sort(T[] array);
}
