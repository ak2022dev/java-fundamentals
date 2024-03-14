package bites.examples;

import java.util.HashMap;

public class ScrabbleScore {
    static HashMap<Character,Integer> letterValues;

    static {
        letterValues = new HashMap<Character,Integer>();
        letterValues.put('A',1);
        letterValues.put('E',1);
        letterValues.put('I',1);
        letterValues.put('O',1);
        letterValues.put('U',1);
        letterValues.put('L',1);
        letterValues.put('N',1);
        letterValues.put('S',1);
        letterValues.put('T',1);
        letterValues.put('R',1);
        letterValues.put('D',2);
        letterValues.put('G',2);
        letterValues.put('B',3);
        letterValues.put('C',3);
        letterValues.put('M',3);
        letterValues.put('P',3);
        letterValues.put('F',4);
        letterValues.put('H',4);
        letterValues.put('V',4);
        letterValues.put('W',4);
        letterValues.put('Y',4);
        letterValues.put('K',5);
        letterValues.put('J',8);
        letterValues.put('X',8);
        letterValues.put('Q',10);
        letterValues.put('Z',10);
    }

    public static Integer calculate( String word ) {
        Integer runningTotal = 0;
        for(int i=0;  i<word.length();  i++) {
            runningTotal += ScrabbleScore.letterValues.get(word.charAt(i));
        }
        return runningTotal;
    }

    public static void main( String[] args ) {
        System.out.println( "Score of EXQUISITELY is: " + ScrabbleScore.calculate( "EXQUISITELY") );
        System.out.println( "Score of THE is: " + ScrabbleScore.calculate( "THE") );
        System.out.println( "Score of QUICK is: " + ScrabbleScore.calculate( "QUICK") );
        System.out.println( "Score of BROWN is: " + ScrabbleScore.calculate( "BROWN") );
        System.out.println( "Score of FOX is: " + ScrabbleScore.calculate( "FOX") );
        System.out.println( "Score of JUMPS is: " + ScrabbleScore.calculate( "JUMPS") );
        System.out.println( "Score of OVER is: " + ScrabbleScore.calculate( "OVER") );
        System.out.println( "Score of LAZY is: " + ScrabbleScore.calculate( "LAZY") );
        System.out.println( "Score of DOG is: " + ScrabbleScore.calculate( "DOG") );
    }
}
