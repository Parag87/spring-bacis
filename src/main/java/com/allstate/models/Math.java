package com.allstate.models;

import java.util.stream.*;

public class Math {

    public static int square(int i) {
        return i * i;
    }

    public static int factorial(int num) {
        return  Stream.iterate(1, n  ->  n +1).limit(num).reduce(1,(acc,cur) -> acc*cur);

    }
}
