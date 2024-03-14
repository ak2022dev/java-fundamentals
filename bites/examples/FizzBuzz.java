package bites.examples;

public class FizzBuzz {
    public static String play( int number ) {
        if( (number % 5 == 0) && (number % 3 == 0) ) {
            return "FizzBuzz";
        }
        else if ( (number % 5 == 0) ) {
            return "Buzz";
        }
        else if ( (number % 3 == 0) ) {
            return "Fizz";
        }
        else return String.format("%d", number );
    }

    public static void main( String[] args ) {
/* Comment out tests from previous work
        System.out.println( "FizzBuzz for 1: " + play(1) );
        System.out.println( "FizzBuzz for 3: " + play(3) );
        System.out.println( "FizzBuzz for 5: " + play(5) );
        System.out.println( "FizzBuzz for 15: " + play(15) );
 */
/* Comment out for-loop version
        for( int i=1; i <=100;  i++) {
            System.out.println( play(i) );
        }
    }
 */
        int i=100;
        while( i>=1 ) {
            System.out.println( play(i) );
            i--;
        }
   }
}

