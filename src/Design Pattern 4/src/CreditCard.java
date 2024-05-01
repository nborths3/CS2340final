public class CreditCard extends PaymentMethod {
    private String cardNumber;
    private int budget;
    public CreditCard(int budget) {
        this.cardNumber = Integer.toString((int) (Math.random() * 10000)) +
                Integer.toString((int) (Math.random() * 10000)) +
                Integer.toString((int) (Math.random() * 10000));
        this.budget = budget;
    }
    @Override
    public boolean makePayment(int amount) {
        if (budget - amount >= 0) {
            budget -= amount;
            System.out.println("Payment of amount " + amount + " successful.");
            return true;
        }
        System.out.println("Payment unsuccessful.");
        return false;
    }

    public String getDetails() {
        return "Method: Credit Card, " + "Card Number: " + this.cardNumber + ", Budget: " + Integer.toString(this.budget);
    }
}
