
public class Main {
    public static void main(String[] args) {
        //Credit Card payment through Stripe
        PaymentMethod creditCard = new CreditCardPayment(new StripePaymentGateway());
        creditCard.pay(100.00);

        // PayPal payment through PayPal Gateway
        PaymentMethod payPal = new PayPalPayment(new PayPalPaymentGateway());
        payPal.pay(150.00);

        // PayPal payment through Stripe (just to show flexibility)
        PaymentMethod payPalViaStripe = new PayPalPayment(new StripePaymentGateway());
        payPalViaStripe.pay(200.00);
        }
    }