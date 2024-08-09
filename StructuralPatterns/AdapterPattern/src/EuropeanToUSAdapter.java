public class EuropeanToUSAdapter implements EuropeanSocket{

    private USSocket usSocket;

    public EuropeanToUSAdapter(USSocket usSocket){
        this.usSocket = usSocket;
    }
    @Override
    public void plugIn() {
        // Adapt the US socket to work with a European socket
        usSocket.connect();
    }
}
