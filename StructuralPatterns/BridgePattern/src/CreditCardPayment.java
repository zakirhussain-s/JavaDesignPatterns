public class CreditCardPayment extends PaymentMethod{

    public CreditCardPayment(PaymentGateway paymentGateway){
        super(paymentGateway);
    }
    @Override
    public void pay(double amount) {
        paymentGateway.processPayment("Credit Card", amount);
    }
}

