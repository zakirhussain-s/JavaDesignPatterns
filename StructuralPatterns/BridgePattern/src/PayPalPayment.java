// Refined Abstraction: PayPalPayment
public class PayPalPayment extends PaymentMethod {
    public PayPalPayment(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    @Override
    public void pay(double amount) {
        paymentGateway.processPayment("PayPal", amount);
    }
}
