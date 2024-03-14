package bites.examples;

public class Discounter {
    int discount;

    public Discounter( int discount ) {
        this.discount = discount;
    }
    public int applyTo( int original ) {
        return (int) (original * ((100 - discount) / 100.0));
    }

   public static void main(String[] args ) {
        Discounter discounter = new Discounter(20);
        System.out.println("Apply 20% discount to 100: " + discounter.applyTo(100 ) );
        System.out.println("Apply 20% discount to 5000: " + discounter.applyTo( 5000 ) );
   }
}
