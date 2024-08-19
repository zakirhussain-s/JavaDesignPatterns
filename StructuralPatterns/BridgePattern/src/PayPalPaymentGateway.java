public class PayPalPaymentGateway implements PaymentGateway {

    @Override
    public void processPayment(String paymentType, double amount) {
        System.out.println("Processing " + paymentType + " payment of $" + amount + " through PayPal.");
    }
}
