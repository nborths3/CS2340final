public abstract class PaymentSystem {
    public abstract PaymentMethod addPaymentMethod(String paymentType, int budget);
    public abstract boolean makePayment(PaymentMethod paymentType, int amount);
}
