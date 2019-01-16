package edu.isu.cs.cs3308.examples.lecture02;

import java.io.PrintStream;
import java.util.Scanner;

public class IOExample {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;
        output.print("Enter your age in years: ");
        double age = input.nextDouble();
        output.print("Enter your maximum heart rate: ");
        double rate = input.nextDouble();
        double fb = (rate - age) * 0.65;
        output.println("Your ideal fat-burning heart rate is " + fb);
        input.close(); // potential memory leak if not close!
    }
}
