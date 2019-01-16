package edu.isu.cs.cs3308.examples.lecture02;

public class Newton {
    public double sqrt(double a) {
        final double EPSILON = 1e-15;
        if (a < 0.0)
            return Double.NaN;

        double x = a;
        while (Math.abs(x - a / x) > EPSILON * x)
            x = (x + a / x) / 2;


        return x;
    }

    public static void main(String[] args) {
        System.out.println("Input numbers & their square roots: ");
        double root;
        for (int i = 0; i < args.length; i++) {
            root = new Newton().sqrt(Double.parseDouble(args[i]));
            System.out.println(args[i] + "\t" + root);
        }
    }
}
