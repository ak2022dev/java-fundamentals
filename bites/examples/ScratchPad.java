package bites.examples;

import java.util.HashMap;

public class ScratchPad {
    public static void printIntArray( Integer[] array) {
        for( Integer i : array ) {
            System.out.print( i );
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main( String[] args ) {
        /* Comment out version which maps to Integer, not array of Integer
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("Red", 1);
        scores.put("Blue", 2);
        System.out.println("According to our scores, team Red score is: " + scores.get("Red") );
        System.out.println("According to our scores, team Blue score is: " + scores.get("Blue") );
         */
        HashMap<String, Integer[]> scores = new HashMap<String, Integer[]>();
        scores.put("Red", new Integer[] {1,2,3} );
        scores.put("Blue", new Integer[] {4,5,6} );
        // Trying to print Integer[] will just give some kind of address of the reference
        System.out.print("According to our scores, team Red score is: " );
        ScratchPad.printIntArray( scores.get("Red") );
        System.out.print("According to our scores, team Blue score is: " );
        ScratchPad.printIntArray( scores.get("Blue") );
    }
}
