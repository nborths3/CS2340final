public class Crypto extends PaymentMethod {
    private int cryptoNumber;
    private int budget;
    public Crypto(int budget) {
        this.cryptoNumber = (int) (Math.random() * 12345);
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

    @Override
    String getDetails() {
        return "Method: Crypto" + ", Crypto Number: " + Integer.toString(this.cryptoNumber);
    }
}
