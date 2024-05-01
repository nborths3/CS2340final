import java.util.ArrayList;

public class StreamingServicePaymentSystem extends PaymentSystem {
    private ArrayList<PaymentMethod> paymentMethods = new ArrayList<>();
    @Override
    public PaymentMethod addPaymentMethod(String paymentType, int budget) {
        PaymentMethod newPaymentMethod = null;
        if (paymentType.equals("PayPal")) {
            newPaymentMethod = new PayPal(budget);
        } else if (paymentType.equals("CreditCard")) {
            newPaymentMethod = new CreditCard(budget);
        } else {
            System.out.println("Unable to accept payment method.");
            return null;
        }
        paymentMethods.add(newPaymentMethod);
        return newPaymentMethod;
    }

    @Override
    public boolean makePayment(PaymentMethod paymentType, int amount) {
        if (paymentMethods.contains(paymentType)) {
            return paymentType.makePayment(amount);
        }
        System.out.println("Payment method not in system.");
        return false;
    }
}
