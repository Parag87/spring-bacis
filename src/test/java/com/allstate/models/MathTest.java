package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class MathTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldSquearAnInteger() throws Exception {
        int result = Math.square(4);
        assertEquals(16,result);
    }

    @Test
    public void shouldReturnFactorialOfGivensInteger() throws Exception {
        int result = Math.factorial(5);
        assertEquals(120,result);
    }

    @Test
    public void shouldReturnFibonacciSeries() throws Exception {
        int result = Math.fibonacci(15);
        assertEquals(610,result);
    }
}