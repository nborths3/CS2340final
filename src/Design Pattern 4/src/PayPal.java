public class PayPal extends PaymentMethod {
    private int accountSecurityKey;
    private int budget;
    public PayPal(int budget) {
        this.accountSecurityKey = (int) (Math.random() * 10000);
        this.budget = budget;
    }
    @Override
    boolean makePayment(int amount) {
        if (budget - amount >= 0) {
            budget -= amount;
            System.out.println("Payment of amount " + amount + " successful.");
            return true;
        }
        System.out.println("Payment unsuccessful.");
        return false;
    }

    public String getDetails() {
        return "Method: PayPal, " + "Security Key: " + Integer.toString(this.accountSecurityKey) + ", Budget: " + Integer.toString(this.budget);
    }
}
