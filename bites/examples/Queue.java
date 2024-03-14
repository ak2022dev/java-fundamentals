package bites.examples;

import java.util.ArrayList;
public class Queue {
    ArrayList<String> people = new ArrayList<String>();

    public void add( String person ) {
        people.add( person );
    }

    public void remove( String person ) {
        int i = 0;
        while( i<people.size() ) {
            if( people.get(i).equals(person) ) {
                people.remove(i);
                return;
            }
            i++;
        }
        // If end of loop reached, person was not in people
    }

    public void state() {
        for( String s:this.people ) {
            System.out.println(s);
        }
    }

    public String next() {
        String firstVal = this.people.get(0);
        this.people.remove(firstVal);
        return firstVal;
    }

    public static void main( String[] args ) {
        Queue queue = new Queue();
        System.out.println("Start with this queue:");
        queue.state();
        System.out.println("Adding Amir");
        queue.add("Amir");
        System.out.println("Adding Neil");
        queue.add("Neil");
        System.out.println("Now have this queue:");
        queue.state();
        System.out.println("Removing Amir");
        queue.remove("Amir");
        System.out.println("Now have this queue:");
        queue.state();
        System.out.println("Removing Paul (not in queue)");
        queue.remove("Paul");
        System.out.println("Now have this queue:");
        queue.state();
        System.out.println("Removing Neil");
        queue.remove("Neil");
        System.out.println("Now have this queue:");
        queue.state();
        System.out.println("Adding Paul");
        queue.add("Paul");
        String firstInQueue = queue.next();
        System.out.println("First in queue was: " + firstInQueue );
        System.out.println("Now have this queue:");
        queue.state();
    }
}
