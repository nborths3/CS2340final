public class Main {
    public static void main(String[] args) {
        // Create an instance of our Streaming Service System
        PaymentSystem newSystem = new StreamingServicePaymentSystem();
        // Add a credit card with a budget of 1000
        PaymentMethod paymentMethod1 = newSystem.addPaymentMethod("CreditCard", 1000);
        // Print the details of the added credit card
        System.out.println(paymentMethod1.getDetails());
        // Add a PayPal account with a budget of 2000
        PaymentMethod paymentMethod2 = newSystem.addPaymentMethod("PayPal", 2000);
        // Print the details of the added PayPal account
        System.out.println(paymentMethod2.getDetails());
        // Attempt to make a payment of 600 using the credit card
        newSystem.makePayment(paymentMethod1, 600);
        // Attempt to make a payment of 1000 using the PayPal account
        newSystem.makePayment(paymentMethod2, 1000);
        // Attempt to make a payment of 500 using the credit card
        newSystem.makePayment(paymentMethod1, 500);
        // Attempt to make a payment using crypto. However, Crypto is not in the system
        newSystem.makePayment(new Crypto(400), 300);
    }
}