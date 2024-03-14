package bites.examples;

public class Bagel {
    public String seeds() {
        return "Sesame seeds";
    }

    public String filling() {
        return "Smoked salmon";
    }

    public Integer price() {
        return 4;
    }

    public static void main( String[] args ) {
        Bagel myBagel = new Bagel();

        System.out.println(myBagel.seeds());
        System.out.println(myBagel.filling());
        System.out.println(myBagel.price());
    }
}
