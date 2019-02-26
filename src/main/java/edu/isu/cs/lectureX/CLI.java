package edu.isu.cs.lectureX;

import java.util.Scanner;

import static sun.misc.Version.print;

public class CLI {

    public static void main(String args[]) {
        int error = 0;
        while (error == 0) {
            String command = read();
            error = eval(command);
            print();
        }
    }

    private static int eval(String eval) {
        return 0;
    }

    private static String read() {
        Scanner scan = new Scanner(System.in);
        System.out.print("$ ");
        return scan.nextLine();
    }
}
