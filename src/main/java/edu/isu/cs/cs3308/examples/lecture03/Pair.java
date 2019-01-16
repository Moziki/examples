package edu.isu.cs.cs3308.examples.lecture03;

public class Pair<A, B> {
    A first;
    B second;

    public Pair(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}
