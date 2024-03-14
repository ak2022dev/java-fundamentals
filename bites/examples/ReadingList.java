package bites.examples;

public class ReadingList {
    // Assume size 100 is large enough
    int nextFreeSlot = 0;
    String[] unread = new String[100];

    public void add( String bookTitle ) {
        this.unread[this.nextFreeSlot] = bookTitle;
        this.nextFreeSlot++;
    }

    public void print() {
        for( int i=0;  i<nextFreeSlot;  i++ ) {
            System.out.println( this.unread[i] );
        }
    }

    public static void main( String[] args ) {
        ReadingList list = new ReadingList();
        System.out.println("Starting with this list:");
        list.print();
        System.out.println("Add 'The C Programming Language'");
        list.add("The C Programming Language");
        System.out.println("Add 'Smalltalk-80'");
        list.add("Smalltalk-80");
        System.out.println("Ending with this list:");
        list.print();
    }
}
