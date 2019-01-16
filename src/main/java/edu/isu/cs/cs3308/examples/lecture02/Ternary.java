package edu.isu.cs.cs3308.examples.lecture02;

public class Ternary {

    public static void main(String args[]) {
        int x = 10;

        boolean y = (x > 5) ? true : false;

        if (x > 5) {
            y = true;
        } else {
            y = false;
        }

        System.out.println(y);

        System.out.println(compare(new Integer(5), new Integer(5)));

        LABEL: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j + i == 10)
                    break LABEL;
            }
        }
    }

    public static int compare(Integer i, Integer j) {
        return (i < j) ? -1 : (i == j ? 0 : 1);
    }
}
