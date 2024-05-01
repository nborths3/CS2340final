public abstract class PaymentMethod {
    abstract boolean makePayment(int amount);
    abstract String getDetails();
}
