package com.allstate.models;

import java.util.stream.*;

public class Math {

    static int first = 0;
    static int second = 1;
    static int sum = 0;
    public static int square(int i) {
        return i * i;
    }

    public static int factorial(int num) {
        return  Stream.iterate(1, n  ->  n +1).limit(num).reduce(1,(acc,cur) -> acc*cur);

    }

    public static int fibonacci(int num) {

//        if(num == 0){
//            return sum;
//        }
//        first = second;
//        second = sum;
//        sum = first + second;
//        num =num-1;
//        return fibonacci(num);
        if(num < 2)
            return  num;
        return fibonacci(num-1) + fibonacci(num-2);
    }
}
