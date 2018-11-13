package com.egencia.sandbox.dproject.case2;

public final class Compute {

    private Compute() {
        // No content
    }

    public static Output multiplyBy2(Input input) {
        return new Output(input.getValue() * 2);
    }
}
