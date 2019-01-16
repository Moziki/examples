package edu.isu.cs.cs3308.examples.lecture02;

public class Overriding {

    public static void main(String[] args) {
        Wine[] wines = {new Wine(), new SparklingWine(), new Champagne()};
        for (Wine wine : wines) System.out.println(wine.name());
    }
}
