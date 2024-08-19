abstract class PaymentMethod {
    protected PaymentGateway paymentGateway;

    public PaymentMethod(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }
    public abstract void pay(double amount);
}
