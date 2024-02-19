public class Order {
    private int quantity;
    private double unitPrice;
    private double totalAmount;
    private String item;
    private PaymentMode paymentMode;


    public PaymentMode setPaymentMode() {
        return paymentMode;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount() {
        this.totalAmount = (unitPrice * quantity) - ((unitPrice * quantity) * paymentMode.determineDiscountRate());
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

}
