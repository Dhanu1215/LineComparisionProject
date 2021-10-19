package com.blp.linecomparisionproject;

/**
 * Line Comparison Computation Program
 */

public class LineComparisonComputation {

    public static void main(String[] args) {
        //Declaring and Initializing the variables
        double x1 = 2;
        double x2 = 4;
        double y1 = 6;
        double y2 = 8;
        //Use Math function to calculate length of line
        double lengthOfLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length Of Line = " + lengthOfLine);
    }
}
