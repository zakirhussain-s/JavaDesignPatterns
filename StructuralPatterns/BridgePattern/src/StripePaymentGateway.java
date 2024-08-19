// Concrete Implementor: StripePaymentGateway
public class StripePaymentGateway implements PaymentGateway{
    @Override
    public void processPayment(String paymentType, double amount) {
        System.out.println("Processing " + paymentType + " payment of $" + amount + " through Stripe.");
    }
}

