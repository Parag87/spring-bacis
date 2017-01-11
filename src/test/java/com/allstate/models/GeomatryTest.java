package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

/**
 * Created by localadmin on 11/01/17.
 */
public class GeomatryTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCalulateDistance() throws Exception{
        List<Geomatry> li = new ArrayList<>();
        li.add(new Geomatry(3,5));
        li.add(new Geomatry(4,1));

        double result = Geomatry.distance(li);
        assertEquals(3.60,result,0.1);
    }

    @Test
    public void shouldCalulateSlope() throws Exception{
        List<Geomatry> li = new ArrayList<>();
        li.add(new Geomatry(3,5));
        li.add(new Geomatry(4,1));

        double result = Geomatry.slope(li);
        assertEquals(-1.5,result,0.1);
    }

    @Test
    public void shouldCalulateYIntercept() throws Exception{
        List<Geomatry> li = new ArrayList<>();
        li.add(new Geomatry(3,5));
        li.add(new Geomatry(4,1));

        double result = Geomatry.yIntercept(li);
        assertEquals(8.5,result,0.1);
    }


}