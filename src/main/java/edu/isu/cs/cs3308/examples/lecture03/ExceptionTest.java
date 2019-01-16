package edu.isu.cs.cs3308.examples.lecture03;

import java.io.IOException;

public class ExceptionTest {

    public static void main(String args[]) {
        try {
            test1();
        } catch (IOException | NewException e) {
            e.getMessage();
        }
    }

    public static void test1() throws NewException, IOException {}
}
