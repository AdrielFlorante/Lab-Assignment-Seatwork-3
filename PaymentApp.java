public class PaymentApp {

    public static void main(String[] args) {

        Order keyboard = new Order();

        keyboard.setItem("keyboard");
        keyboard.setQuantity(10);
        keyboard.setUnitPrice(300.0);

        System.out.println("Order item is " + keyboard.getItem());
        System.out.println("Unit price is " + keyboard.getUnitPrice());
        System.out.println("Quantity is " + keyboard.getQuantity());

        // GCash
        keyboard.setPaymentMode(new GCash());
        keyboard.setTotalAmount();
        System.out.println("\nPayment order details if GCash");
        System.out.println("Discount rate is " + keyboard.getPaymentMode().determineDiscountRate());
        System.out.println("Payment amount is " + keyboard.getTotalAmount());

        // Maya
        keyboard.setPaymentMode(new Maya());
        keyboard.setTotalAmount();
        System.out.println("\nPayment order details if Maya");
        System.out.println("Discount rate is " + keyboard.getPaymentMode().determineDiscountRate());
        System.out.println("Payment amount is " + keyboard.getTotalAmount());

        // ShopeePay
        keyboard.setPaymentMode(new ShopeePay());
        keyboard.setTotalAmount();
        System.out.println("\nPayment order details if ShopeePay");
        System.out.println("Discount rate is " + keyboard.getPaymentMode().determineDiscountRate());
        System.out.println("Payment amount is " + keyboard.getTotalAmount());

    }

}