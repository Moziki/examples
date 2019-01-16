package edu.isu.cs.cs3308.examples.lecture02;

public class WineRegion {

    public static String region (Wine w) { return "Napa Valley"; }
    public static String revion (SparklingWine s) { return "Niagara"; }
    public static String region (Champagne c) { return "France"; }

    public static void main(String[] args) {
        Wine[] wines = {
                new Wine(),
                new SparklingWine(),
                new Champagne()
        };
        for (Wine w : wines) System.out.println(region(w));
    }
}
