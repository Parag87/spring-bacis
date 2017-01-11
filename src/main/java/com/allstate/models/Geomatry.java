package com.allstate.models;

import java.lang.Math;
import java.util.List;

/**
 * Created by localadmin on 11/01/17.
 */
public class Geomatry {
    private int x1;
    private int x2;

    public Geomatry(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public Geomatry() {
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }
    public  double getSquare(){
        return (this.x1 - this.x2) * (this.x1 - this.x2);
    }

    public  double getDiff(){
        return (this.x1 - this.x2);
    }

    public static double distance(List<Geomatry> li) {

        double result =  li.stream().map(e -> e.getSquare()).reduce(0d,(acc,elem) -> acc + elem);
        //double res = ((a1 - a2) * (a1 - a2)) + ((b1 - b2) * (b1 - b2));
        return Math.sqrt(result);
    }

    public static double slope(List<Geomatry> li) {
            System.out.println("li-->>"+li);
         return  li.get(1).getDiff() / li.get(0).getDiff();
    }
    public static double yIntercept(List<Geomatry> li){
        return  (li.get(1).x1 - ((li.get(0).x1 * li.get(1).getDiff()))/li.get(0).getDiff());
    }
}
