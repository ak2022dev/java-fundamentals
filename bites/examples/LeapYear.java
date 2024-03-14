package bites.examples;

public class LeapYear {
    public static boolean isLeapYear( int year ) {
        // All years divisible by 400 ARE leap years (e.g. 2000 was a leap year)
        if ( LeapYear.isDivisibleBy(year, 400) ) {
            return true;
        }
        // All years divisible by 100 but not by 400 are NOT leap years (e.g. 1700, 1800 and 1900 were not leap years)
        if ( LeapYear.isDivisibleBy(year, 100) && !(LeapYear.isDivisibleBy(year, 400)) ) {
            return false;
        }
        // All years not divisible by 4 are NOT leap years (e.g. 2009, 2010 and 2011 were not leap years)
        if ( !LeapYear.isDivisibleBy(year, 4)) {
            return false;
        }
        // All years divisible by 4 and not by 100 ARE leap years (e.g. 2004, 2008 and 2012 were leap years)
        if ( LeapYear.isDivisibleBy(year, 4) && !LeapYear.isDivisibleBy(year, 100)) {
            return true;
        }
        // I am guessing all other years are not leap years(!)
        return false;
    }
    public static boolean isDivisibleBy( int number, int possibleFactor ) {
        return ((number % possibleFactor) == 0);
    }

    public static void main( String[] args ) {
        System.out.println( "Is 8 divisible by 4? " + LeapYear.isDivisibleBy(8, 4) );
        System.out.println( "Is 8 divisible by 2? " + LeapYear.isDivisibleBy(8, 2) );
        System.out.println( "Is 8 divisible by 3? " + LeapYear.isDivisibleBy(8, 3) );
        System.out.println( "Is year 2000 a leap year? " + LeapYear.isLeapYear(2000) );
        System.out.println( "Is year 2009 a leap year? " + LeapYear.isLeapYear(2009) );
        System.out.println( "Is year 2010 a leap year? " + LeapYear.isLeapYear(2010) );
        System.out.println( "Is year 2011 a leap year? " + LeapYear.isLeapYear(2011) );
        System.out.println( "Is year 1700 a leap year? " + LeapYear.isLeapYear(1700) );
        System.out.println( "Is year 1800 a leap year? " + LeapYear.isLeapYear(1800) );
        System.out.println( "Is year 1900 a leap year? " + LeapYear.isLeapYear(1900) );
        System.out.println( "Is year 2004 a leap year? " + LeapYear.isLeapYear(2004) );
        System.out.println( "Is year 2008 a leap year? " + LeapYear.isLeapYear(2008) );
        System.out.println( "Is year 2012 a leap year? " + LeapYear.isLeapYear(2012) );
    }
}
