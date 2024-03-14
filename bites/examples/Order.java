package bites.examples;

public class Order {
    Integer total;

    public void addAmount( Integer amount ) {
        this.total += amount;
    }

    public void addDiscount( Integer discount ) {
        this.total -= discount;
    }

    public Integer getTotal() {
        return this.total;
    }

    public String friendlyTotal() {
        return String.format( "Thanks! The total value of your order is £%d", this.getTotal() );
    }
    public Order() {
        this.total = 0;
    }

    public static void main( String[] args ) {
        Order order = new Order();
        System.out.println("Start with total: " + order.getTotal() );
        order.addAmount( 50 );
        System.out.println("After adding 50, total is now: " + order.getTotal() );
        order.addDiscount( 20 );
        System.out.println("After discounting 20, final total is: " + order.getTotal() );
        System.out.println( order.friendlyTotal() );
    }
}
